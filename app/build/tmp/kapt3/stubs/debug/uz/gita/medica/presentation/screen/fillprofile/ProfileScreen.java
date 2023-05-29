package uz.gita.medica.presentation.screen.fillprofile;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020\u0016H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006+"}, d2 = {"Luz/gita/medica/presentation/screen/fillprofile/ProfileScreen;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Luz/gita/medica/presentation/screen/fillprofile/ProfileScreenArgs;", "getArgs", "()Luz/gita/medica/presentation/screen/fillprofile/ProfileScreenArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Luz/gita/a5/medica/databinding/ScreenProfileBinding;", "getBinding", "()Luz/gita/a5/medica/databinding/ScreenProfileBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "imageUri", "Landroid/net/Uri;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "openNextScreenLiveData", "Landroidx/lifecycle/Observer;", "", "sharedPref", "Luz/gita/medica/data/source/local/sharedpref/MySharedPref;", "getSharedPref", "()Luz/gita/medica/data/source/local/sharedpref/MySharedPref;", "setSharedPref", "(Luz/gita/medica/data/source/local/sharedpref/MySharedPref;)V", "viewModel", "Luz/gita/medica/presentation/screen/fillprofile/viewmodel/ProfileViewModelImpl;", "getViewModel", "()Luz/gita/medica/presentation/screen/fillprofile/viewmodel/ProfileViewModelImpl;", "viewModel$delegate", "Lkotlin/Lazy;", "check", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "openGallery", "app_debug"})
public final class ProfileScreen extends androidx.fragment.app.Fragment {
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri imageUri;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @javax.inject.Inject
    public uz.gita.medica.data.source.local.sharedpref.MySharedPref sharedPref;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<kotlin.Unit> openNextScreenLiveData = null;
    
    public ProfileScreen() {
        super();
    }
    
    private final uz.gita.a5.medica.databinding.ScreenProfileBinding getBinding() {
        return null;
    }
    
    private final uz.gita.medica.presentation.screen.fillprofile.viewmodel.ProfileViewModelImpl getViewModel() {
        return null;
    }
    
    private final uz.gita.medica.presentation.screen.fillprofile.ProfileScreenArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.medica.data.source.local.sharedpref.MySharedPref getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.source.local.sharedpref.MySharedPref p0) {
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
    
    private final void check() {
    }
    
    private final void openGallery() {
    }
}