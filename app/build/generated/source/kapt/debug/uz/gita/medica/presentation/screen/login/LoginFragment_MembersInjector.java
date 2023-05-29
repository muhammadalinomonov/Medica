package uz.gita.medica.presentation.screen.login;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.medica.data.source.local.sharedpref.MySharedPref;

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
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
  private final Provider<MySharedPref> sharedPrefProvider;

  public LoginFragment_MembersInjector(Provider<MySharedPref> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  public static MembersInjector<LoginFragment> create(Provider<MySharedPref> sharedPrefProvider) {
    return new LoginFragment_MembersInjector(sharedPrefProvider);
  }

  @Override
  public void injectMembers(LoginFragment instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
  }

  @InjectedFieldSignature("uz.gita.medica.presentation.screen.login.LoginFragment.sharedPref")
  public static void injectSharedPref(LoginFragment instance, MySharedPref sharedPref) {
    instance.sharedPref = sharedPref;
  }
}
