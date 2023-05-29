package uz.gita.medica.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Luz/gita/medica/di/RepositoryModule;", "", "bindAuthRepository", "Luz/gita/medica/domain/repository/AuthRepository;", "impl", "Luz/gita/medica/domain/repository/impl/AuthRepositoryImpl;", "bindBookRepository", "Luz/gita/medica/domain/repository/HomeRepository;", "Luz/gita/medica/domain/repository/impl/HomeRepositoryImpl;", "bindRepository", "Luz/gita/medica/domain/repository/ProfileRepository;", "Luz/gita/medica/domain/repository/impl/ProfileRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface RepositoryModule {
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.repository.ProfileRepository bindRepository(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.repository.impl.ProfileRepositoryImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.repository.AuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.repository.impl.AuthRepositoryImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.medica.domain.repository.HomeRepository bindBookRepository(@org.jetbrains.annotations.NotNull
    uz.gita.medica.domain.repository.impl.HomeRepositoryImpl impl);
}