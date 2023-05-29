package uz.gita.medica.presentation.screen.home;

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
public final class HomeScreen_MembersInjector implements MembersInjector<HomeScreen> {
  private final Provider<MySharedPref> sharedPrefProvider;

  public HomeScreen_MembersInjector(Provider<MySharedPref> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  public static MembersInjector<HomeScreen> create(Provider<MySharedPref> sharedPrefProvider) {
    return new HomeScreen_MembersInjector(sharedPrefProvider);
  }

  @Override
  public void injectMembers(HomeScreen instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
  }

  @InjectedFieldSignature("uz.gita.medica.presentation.screen.home.HomeScreen.sharedPref")
  public static void injectSharedPref(HomeScreen instance, MySharedPref sharedPref) {
    instance.sharedPref = sharedPref;
  }
}
