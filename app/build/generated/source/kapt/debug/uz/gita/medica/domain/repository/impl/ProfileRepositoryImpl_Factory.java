package uz.gita.medica.domain.repository.impl;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ProfileRepositoryImpl_Factory implements Factory<ProfileRepositoryImpl> {
  private final Provider<FirebaseFirestore> fireStoreProvider;

  private final Provider<StorageReference> storageReferenceProvider;

  public ProfileRepositoryImpl_Factory(Provider<FirebaseFirestore> fireStoreProvider,
      Provider<StorageReference> storageReferenceProvider) {
    this.fireStoreProvider = fireStoreProvider;
    this.storageReferenceProvider = storageReferenceProvider;
  }

  @Override
  public ProfileRepositoryImpl get() {
    return newInstance(fireStoreProvider.get(), storageReferenceProvider.get());
  }

  public static ProfileRepositoryImpl_Factory create(Provider<FirebaseFirestore> fireStoreProvider,
      Provider<StorageReference> storageReferenceProvider) {
    return new ProfileRepositoryImpl_Factory(fireStoreProvider, storageReferenceProvider);
  }

  public static ProfileRepositoryImpl newInstance(FirebaseFirestore fireStore,
      StorageReference storageReference) {
    return new ProfileRepositoryImpl(fireStore, storageReference);
  }
}
