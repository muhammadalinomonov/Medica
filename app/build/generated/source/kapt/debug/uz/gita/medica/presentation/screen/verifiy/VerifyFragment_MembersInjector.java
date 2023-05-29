package uz.gita.medica.presentation.screen.verifiy;

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
public final class VerifyFragment_MembersInjector implements MembersInjector<VerifyFragment> {
  private final Provider<MySharedPref> sharePrefProvider;

  public VerifyFragment_MembersInjector(Provider<MySharedPref> sharePrefProvider) {
    this.sharePrefProvider = sharePrefProvider;
  }

  public static MembersInjector<VerifyFragment> create(Provider<MySharedPref> sharePrefProvider) {
    return new VerifyFragment_MembersInjector(sharePrefProvider);
  }

  @Override
  public void injectMembers(VerifyFragment instance) {
    injectSharePref(instance, sharePrefProvider.get());
  }

  @InjectedFieldSignature("uz.gita.medica.presentation.screen.verifiy.VerifyFragment.sharePref")
  public static void injectSharePref(VerifyFragment instance, MySharedPref sharePref) {
    instance.sharePref = sharePref;
  }
}
