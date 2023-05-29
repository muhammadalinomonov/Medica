package uz.gita.medica.presentation.screen.login.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.medica.domain.usecase.LoginUseCase;

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
public final class LoginViewModelImpl_Factory implements Factory<LoginViewModelImpl> {
  private final Provider<LoginUseCase> useCaseProvider;

  public LoginViewModelImpl_Factory(Provider<LoginUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public LoginViewModelImpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static LoginViewModelImpl_Factory create(Provider<LoginUseCase> useCaseProvider) {
    return new LoginViewModelImpl_Factory(useCaseProvider);
  }

  public static LoginViewModelImpl newInstance(LoginUseCase useCase) {
    return new LoginViewModelImpl(useCase);
  }
}
