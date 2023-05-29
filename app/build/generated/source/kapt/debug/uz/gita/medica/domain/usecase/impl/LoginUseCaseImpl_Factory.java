package uz.gita.medica.domain.usecase.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.medica.domain.repository.AuthRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginUseCaseImpl_Factory implements Factory<LoginUseCaseImpl> {
  private final Provider<AuthRepository> repositoryProvider;

  public LoginUseCaseImpl_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public LoginUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static LoginUseCaseImpl_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new LoginUseCaseImpl_Factory(repositoryProvider);
  }

  public static LoginUseCaseImpl newInstance(AuthRepository repository) {
    return new LoginUseCaseImpl(repository);
  }
}
