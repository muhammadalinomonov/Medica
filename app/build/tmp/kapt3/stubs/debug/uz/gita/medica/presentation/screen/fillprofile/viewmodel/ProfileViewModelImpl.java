package uz.gita.medica.presentation.screen.fillprofile.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005JJ\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Luz/gita/medica/presentation/screen/fillprofile/viewmodel/ProfileViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/medica/presentation/screen/fillprofile/viewmodel/ProfileViewModel;", "useCase", "Luz/gita/medica/domain/usecase/ProfileUseCase;", "(Luz/gita/medica/domain/usecase/ProfileUseCase;)V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "openNextScreenLiveData", "", "getOpenNextScreenLiveData", "addProfile", "fullName", "nickName", "date", "email", "phone", "gender", "imgUri", "Landroid/net/Uri;", "password", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfileViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.medica.presentation.screen.fillprofile.viewmodel.ProfileViewModel {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.medica.domain.usecase.ProfileUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> openNextScreenLiveData = null;
    
    @javax.inject.Inject
    public ProfileViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.ProfileUseCase useCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getOpenNextScreenLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void addProfile(@org.jetbrains.annotations.NotNull
    java.lang.String fullName, @org.jetbrains.annotations.NotNull
    java.lang.String nickName, @org.jetbrains.annotations.NotNull
    java.lang.String date, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.Nullable
    android.net.Uri imgUri, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}