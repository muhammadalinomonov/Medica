package uz.gita.medica.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Luz/gita/medica/di/UseCaseModule;", "", "bindLoginUseCase", "Luz/gita/medica/domain/usecase/LoginUseCase;", "impl", "Luz/gita/medica/domain/usecase/impl/LoginUseCaseImpl;", "bindProfileUseCase", "Luz/gita/medica/domain/usecase/ProfileUseCase;", "Luz/gita/medica/domain/usecase/impl/ProfileUseCaseImpl;", "bindSignInUseCase", "Luz/gita/medica/domain/usecase/SignInUseCase;", "Luz/gita/medica/domain/usecase/impl/SignInUseCaseImpl;", "bindUseCase", "Luz/gita/medica/domain/usecase/UseCase;", "Luz/gita/medica/domain/usecase/impl/UseCaseImpl;", "bindVerifyUseCase", "Luz/gita/medica/domain/usecase/VerifyUseCase;", "Luz/gita/medica/domain/usecase/impl/VerifyUseCaseImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface UseCaseModule {
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.usecase.ProfileUseCase bindProfileUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.impl.ProfileUseCaseImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.usecase.SignInUseCase bindSignInUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.impl.SignInUseCaseImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.usecase.VerifyUseCase bindVerifyUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.impl.VerifyUseCaseImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.usecase.LoginUseCase bindLoginUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.impl.LoginUseCaseImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.usecase.UseCase bindUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.usecase.impl.UseCaseImpl impl);
}