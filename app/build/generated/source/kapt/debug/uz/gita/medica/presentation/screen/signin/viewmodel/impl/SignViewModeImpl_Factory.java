package uz.gita.medica.presentation.screen.signin.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.medica.domain.usecase.SignInUseCase;

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
public final class SignViewModeImpl_Factory implements Factory<SignViewModeImpl> {
  private final Provider<SignInUseCase> useCaseProvider;

  public SignViewModeImpl_Factory(Provider<SignInUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public SignViewModeImpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static SignViewModeImpl_Factory create(Provider<SignInUseCase> useCaseProvider) {
    return new SignViewModeImpl_Factory(useCaseProvider);
  }

  public static SignViewModeImpl newInstance(SignInUseCase useCase) {
    return new SignViewModeImpl(useCase);
  }
}
