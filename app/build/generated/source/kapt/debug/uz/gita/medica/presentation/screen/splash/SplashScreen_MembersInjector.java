package uz.gita.medica.presentation.screen.splash;

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
public final class SplashScreen_MembersInjector implements MembersInjector<SplashScreen> {
  private final Provider<MySharedPref> sharedPrefProvider;

  public SplashScreen_MembersInjector(Provider<MySharedPref> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  public static MembersInjector<SplashScreen> create(Provider<MySharedPref> sharedPrefProvider) {
    return new SplashScreen_MembersInjector(sharedPrefProvider);
  }

  @Override
  public void injectMembers(SplashScreen instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
  }

  @InjectedFieldSignature("uz.gita.medica.presentation.screen.splash.SplashScreen.sharedPref")
  public static void injectSharedPref(SplashScreen instance, MySharedPref sharedPref) {
    instance.sharedPref = sharedPref;
  }
}
