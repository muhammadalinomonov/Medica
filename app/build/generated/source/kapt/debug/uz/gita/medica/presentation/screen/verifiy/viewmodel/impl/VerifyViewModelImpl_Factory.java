package uz.gita.medica.presentation.screen.verifiy.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.medica.domain.usecase.VerifyUseCase;

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
public final class VerifyViewModelImpl_Factory implements Factory<VerifyViewModelImpl> {
  private final Provider<VerifyUseCase> verifyUseCaseProvider;

  public VerifyViewModelImpl_Factory(Provider<VerifyUseCase> verifyUseCaseProvider) {
    this.verifyUseCaseProvider = verifyUseCaseProvider;
  }

  @Override
  public VerifyViewModelImpl get() {
    return newInstance(verifyUseCaseProvider.get());
  }

  public static VerifyViewModelImpl_Factory create(Provider<VerifyUseCase> verifyUseCaseProvider) {
    return new VerifyViewModelImpl_Factory(verifyUseCaseProvider);
  }

  public static VerifyViewModelImpl newInstance(VerifyUseCase verifyUseCase) {
    return new VerifyViewModelImpl(verifyUseCase);
  }
}
