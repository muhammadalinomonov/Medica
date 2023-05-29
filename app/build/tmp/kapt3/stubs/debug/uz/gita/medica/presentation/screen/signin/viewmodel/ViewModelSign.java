package uz.gita.medica.presentation.screen.signin.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Luz/gita/medica/presentation/screen/signin/viewmodel/ViewModelSign;", "", "failLiveData", "Landroidx/lifecycle/LiveData;", "", "getFailLiveData", "()Landroidx/lifecycle/LiveData;", "resultLiveData", "Luz/gita/medica/data/response/MessageResponse;", "getResultLiveData", "signUp", "", "registerRequest", "Luz/gita/medica/data/request/RegisterRequest;", "app_debug"})
public abstract interface ViewModelSign {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<uz.gita.medica.data.response.MessageResponse> getResultLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getFailLiveData();
    
    public abstract void signUp(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.request.RegisterRequest registerRequest);
}