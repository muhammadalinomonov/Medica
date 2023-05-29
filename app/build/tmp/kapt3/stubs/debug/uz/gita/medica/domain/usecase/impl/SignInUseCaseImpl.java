package uz.gita.medica.domain.usecase.impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Luz/gita/medica/domain/usecase/impl/SignInUseCaseImpl;", "Luz/gita/medica/domain/usecase/SignInUseCase;", "repository", "Luz/gita/medica/domain/repository/AuthRepository;", "(Luz/gita/medica/domain/repository/AuthRepository;)V", "register", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/gita/medica/data/response/MessageResponse;", "request", "Luz/gita/medica/data/request/RegisterRequest;", "app_debug"})
public final class SignInUseCaseImpl implements uz.gita.medica.domain.usecase.SignInUseCase {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.medica.domain.repository.AuthRepository repository = null;
    
    @javax.inject.Inject
    public SignInUseCaseImpl(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.repository.AuthRepository repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.medica.data.response.MessageResponse>> register(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.request.RegisterRequest request) {
        return null;
    }
}