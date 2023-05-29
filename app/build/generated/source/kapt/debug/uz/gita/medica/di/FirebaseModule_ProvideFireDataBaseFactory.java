package uz.gita.medica.di;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class FirebaseModule_ProvideFireDataBaseFactory implements Factory<FirebaseFirestore> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFireDataBaseFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseFirestore get() {
    return provideFireDataBase(module);
  }

  public static FirebaseModule_ProvideFireDataBaseFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFireDataBaseFactory(module);
  }

  public static FirebaseFirestore provideFireDataBase(FirebaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFireDataBase());
  }
}
