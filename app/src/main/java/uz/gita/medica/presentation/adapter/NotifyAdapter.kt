package uz.gita.medica.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.gita.a5.medica.R
import uz.gita.a5.medica.databinding.ItemNotificationBinding
import uz.gita.medica.data.models.NotifyData

class NotifyAdapter:ListAdapter<NotifyData, NotifyAdapter.ViewHolder>(MyDiffUtil) {
    object MyDiffUtil : DiffUtil.ItemCallback<NotifyData>() {
        override fun areItemsTheSame(oldItem: NotifyData, newItem: NotifyData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: NotifyData, newItem: NotifyData): Boolean {
            return oldItem == newItem
        }
    }

    inner class ViewHolder(private val binding: ItemNotificationBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(news_item:NotifyData) = with(binding){
           when(news_item.icon) {
               1L -> {
                   imgIcon.setImageResource(R.drawable.ic_cancel)
               }
               2L -> {
                   imgIcon.setImageResource(R.drawable.ic_changed)
               }
               3L -> {
                   imgIcon.setImageResource(R.drawable.ic_succes)
               }
               4L -> {
                   imgIcon.setImageResource(R.drawable.ic_available)
               }
               else -> {
                   imgIcon.setImageResource(R.drawable.ic_connected)
               }
           }
               if(news_item.isNew){
                   imgNew.visibility =  View.VISIBLE
               }else{
                   imgNew.visibility = View.GONE
               }
            txtNameNotification.text = news_item.name
            txtDateNotification.text = news_item.data
            txtDescriptionNotific.text = news_item.description
           }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ItemNotificationBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).let {
            holder.bind(it)
        }
    }
}