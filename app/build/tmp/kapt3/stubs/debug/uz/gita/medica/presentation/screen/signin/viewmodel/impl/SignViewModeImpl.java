package uz.gita.medica.presentation.screen.signin.viewmodel.impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Luz/gita/medica/presentation/screen/signin/viewmodel/impl/SignViewModeImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/medica/presentation/screen/signin/viewmodel/ViewModelSign;", "useCase", "Luz/gita/medica/domain/usecase/SignInUseCase;", "(Luz/gita/medica/domain/usecase/SignInUseCase;)V", "failLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getFailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "resultLiveData", "Luz/gita/medica/data/response/MessageResponse;", "getResultLiveData", "signUp", "", "registerRequest", "Luz/gita/medica/data/request/RegisterRequest;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignViewModeImpl extends androidx.lifecycle.ViewModel implements uz.gita.medica.presentation.screen.signin.viewmodel.ViewModelSign {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.medica.domain.usecase.SignInUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<uz.gita.medica.data.response.MessageResponse> resultLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> failLiveData = null;
    
    @javax.inject.Inject
    public SignViewModeImpl(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.SignInUseCase useCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<uz.gita.medica.data.response.MessageResponse> getResultLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getFailLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void signUp(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.request.RegisterRequest registerRequest) {
    }
}