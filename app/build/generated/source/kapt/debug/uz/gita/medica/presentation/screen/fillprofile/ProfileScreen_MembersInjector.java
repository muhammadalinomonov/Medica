package uz.gita.medica.presentation.screen.fillprofile;

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
public final class ProfileScreen_MembersInjector implements MembersInjector<ProfileScreen> {
  private final Provider<MySharedPref> sharedPrefProvider;

  public ProfileScreen_MembersInjector(Provider<MySharedPref> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  public static MembersInjector<ProfileScreen> create(Provider<MySharedPref> sharedPrefProvider) {
    return new ProfileScreen_MembersInjector(sharedPrefProvider);
  }

  @Override
  public void injectMembers(ProfileScreen instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
  }

  @InjectedFieldSignature("uz.gita.medica.presentation.screen.fillprofile.ProfileScreen.sharedPref")
  public static void injectSharedPref(ProfileScreen instance, MySharedPref sharedPref) {
    instance.sharedPref = sharedPref;
  }
}
