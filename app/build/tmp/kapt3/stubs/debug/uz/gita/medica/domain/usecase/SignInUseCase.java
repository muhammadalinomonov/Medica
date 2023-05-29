package uz.gita.medica.domain.usecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Luz/gita/medica/domain/usecase/SignInUseCase;", "", "register", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/gita/medica/data/response/MessageResponse;", "request", "Luz/gita/medica/data/request/RegisterRequest;", "app_debug"})
public abstract interface SignInUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.medica.data.response.MessageResponse>> register(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.request.RegisterRequest request);
}