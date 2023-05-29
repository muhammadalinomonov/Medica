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
public final class SignInUseCaseImpl_Factory implements Factory<SignInUseCaseImpl> {
  private final Provider<AuthRepository> repositoryProvider;

  public SignInUseCaseImpl_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SignInUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static SignInUseCaseImpl_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new SignInUseCaseImpl_Factory(repositoryProvider);
  }

  public static SignInUseCaseImpl newInstance(AuthRepository repository) {
    return new SignInUseCaseImpl(repository);
  }
}
