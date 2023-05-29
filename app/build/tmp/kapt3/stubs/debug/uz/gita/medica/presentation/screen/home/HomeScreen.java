package uz.gita.medica.presentation.screen.home;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\'"}, d2 = {"Luz/gita/medica/presentation/screen/home/HomeScreen;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Luz/gita/medica/presentation/adapter/DoctorAdapter;", "binding", "Luz/gita/a5/medica/databinding/ScreenHomeBinding;", "getBinding", "()Luz/gita/a5/medica/databinding/ScreenHomeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "sharedPref", "Luz/gita/medica/data/source/local/sharedpref/MySharedPref;", "getSharedPref", "()Luz/gita/medica/data/source/local/sharedpref/MySharedPref;", "setSharedPref", "(Luz/gita/medica/data/source/local/sharedpref/MySharedPref;)V", "<set-?>", "", "t", "getT", "()Z", "setT", "(Z)V", "t$delegate", "Lkotlin/properties/ReadWriteProperty;", "viewModel", "Luz/gita/medica/presentation/screen/home/viewmodel/HomeViewModelImpl;", "getViewModel", "()Luz/gita/medica/presentation/screen/home/viewmodel/HomeViewModelImpl;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
public final class HomeScreen extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final uz.gita.medica.presentation.adapter.DoctorAdapter adapter = null;
    @javax.inject.Inject
    public uz.gita.medica.data.source.local.sharedpref.MySharedPref sharedPref;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty t$delegate = null;
    
    public HomeScreen() {
        super();
    }
    
    private final uz.gita.a5.medica.databinding.ScreenHomeBinding getBinding() {
        return null;
    }
    
    private final uz.gita.medica.presentation.screen.home.viewmodel.HomeViewModelImpl getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.medica.data.source.local.sharedpref.MySharedPref getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.source.local.sharedpref.MySharedPref p0) {
    }
    
    public final boolean getT() {
        return false;
    }
    
    public final void setT(boolean p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}