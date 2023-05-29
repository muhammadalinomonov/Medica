package uz.gita.medica.presentation.screen.verifiy.viewmodel.impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/gita/medica/presentation/screen/verifiy/viewmodel/impl/VerifyViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/medica/presentation/screen/verifiy/viewmodel/VerifyViewModel;", "verifyUseCase", "Luz/gita/medica/domain/usecase/VerifyUseCase;", "(Luz/gita/medica/domain/usecase/VerifyUseCase;)V", "addLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAddLiveData", "()Landroidx/lifecycle/MutableLiveData;", "failLiveData", "getFailLiveData", "successLiveData", "Luz/gita/medica/data/response/VerifyResponse;", "getSuccessLiveData", "addUser", "", "user", "Luz/gita/medica/data/response/UserData;", "verify", "request", "Luz/gita/medica/data/request/VerifyRequest;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class VerifyViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.medica.presentation.screen.verifiy.viewmodel.VerifyViewModel {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.medica.domain.usecase.VerifyUseCase verifyUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<uz.gita.medica.data.response.VerifyResponse> successLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> addLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> failLiveData = null;
    
    @javax.inject.Inject
    public VerifyViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.VerifyUseCase verifyUseCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<uz.gita.medica.data.response.VerifyResponse> getSuccessLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getAddLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getFailLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void verify(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.request.VerifyRequest request) {
    }
    
    @java.lang.Override
    public void addUser(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.response.UserData user) {
    }
}