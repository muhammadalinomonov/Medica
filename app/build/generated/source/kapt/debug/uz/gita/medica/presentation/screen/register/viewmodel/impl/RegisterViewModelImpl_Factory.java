package uz.gita.medica.presentation.screen.register.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class RegisterViewModelImpl_Factory implements Factory<RegisterViewModelImpl> {
  @Override
  public RegisterViewModelImpl get() {
    return newInstance();
  }

  public static RegisterViewModelImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RegisterViewModelImpl newInstance() {
    return new RegisterViewModelImpl();
  }

  private static final class InstanceHolder {
    private static final RegisterViewModelImpl_Factory INSTANCE = new RegisterViewModelImpl_Factory();
  }
}
