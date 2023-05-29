package uz.gita.medica.di;

import com.google.firebase.storage.StorageReference;
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
public final class FirebaseModule_ProvideFireStorageFactory implements Factory<StorageReference> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFireStorageFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public StorageReference get() {
    return provideFireStorage(module);
  }

  public static FirebaseModule_ProvideFireStorageFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFireStorageFactory(module);
  }

  public static StorageReference provideFireStorage(FirebaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFireStorage());
  }
}
