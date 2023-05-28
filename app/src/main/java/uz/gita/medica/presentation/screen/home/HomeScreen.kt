package uz.gita.medica.presentation.screen.home

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.ScreenHomeBinding
import uz.gita.medica.data.source.local.sharedpref.MySharedPref
import uz.gita.medica.presentation.adapter.DoctorAdapter
import uz.gita.medica.presentation.screen.home.viewmodel.HomeViewModelImpl
import javax.inject.Inject
import kotlin.properties.Delegates

@AndroidEntryPoint
class HomeScreen : Fragment(R.layout.screen_home) {
    private val binding by viewBinding(ScreenHomeBinding::bind)
    private val viewModel by viewModels<HomeViewModelImpl>()
    private val adapter: DoctorAdapter = DoctorAdapter()

    @Inject
    lateinit var sharedPref: MySharedPref
    var t by Delegates.notNull<Boolean>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getDoctors()
        t = true
        requireActivity().getWindow()
            .setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val animliad = binding.progress.drawable as AnimationDrawable
        animliad.start()

        viewModel.getUserInformations(sharedPref.phone)
        viewModel.searchListLiveData.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.loadingLiveData.observe(viewLifecycleOwner) {
            if (it && t) {
                binding.progress.visibility = View.VISIBLE
            } else {
                binding.progress.visibility = View.GONE
                t = false
            }
        }
        viewModel.errorLiveData.observe(viewLifecycleOwner) {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        }
        viewModel.userLiveData.observe(viewLifecycleOwner) {
            Log.d("GGG", it.imageUrl)
            Glide.with(requireContext())
                .load(it.imageUrl)
                .centerCrop()
                .into(binding.imgUser)
            binding.txtNameUser.text = it.name
        }
        viewModel.doctorsLiveData.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        binding.apply {
            adapter.setFavouriteListener {
                viewModel.changeFavoutite(it)
            }
            recyclerView.adapter = adapter
            recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)
        }
        binding.btnFavourite.setOnClickListener {

            findNavController().navigate(R.id.action_homeScreen_to_favouriteScreen)
        }
        binding.btnNotifications.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreen_to_notificationScreen)
        }
        binding.searchBar.doAfterTextChanged {
            val text = it?.trim().toString()
            if (text.isNullOrEmpty()) {
                viewModel.getDoctors()
                binding.container1.visibility = View.VISIBLE
                binding.container2.visibility = View.VISIBLE
                binding.searchBar.isCursorVisible = false

            } else {
                viewModel.searchFun(text)
                binding.searchBar.isCursorVisible = true

                binding.container1.visibility = View.GONE
                binding.container2.visibility = View.GONE
            }
        }
    }
}