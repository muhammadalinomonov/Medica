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
public final class VerifyUseCaseImpl_Factory implements Factory<VerifyUseCaseImpl> {
  private final Provider<AuthRepository> repositoryProvider;

  public VerifyUseCaseImpl_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public VerifyUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static VerifyUseCaseImpl_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new VerifyUseCaseImpl_Factory(repositoryProvider);
  }

  public static VerifyUseCaseImpl newInstance(AuthRepository repository) {
    return new VerifyUseCaseImpl(repository);
  }
}
