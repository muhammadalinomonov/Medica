package uz.gita.medica.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.medica.data.source.local.room.local.DoctorDatabase;
import uz.gita.medica.data.source.local.room.local.dao.DoctorDao;

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
public final class RoomModule_ProvideDaoFactory implements Factory<DoctorDao> {
  private final RoomModule module;

  private final Provider<DoctorDatabase> dbProvider;

  public RoomModule_ProvideDaoFactory(RoomModule module, Provider<DoctorDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public DoctorDao get() {
    return provideDao(module, dbProvider.get());
  }

  public static RoomModule_ProvideDaoFactory create(RoomModule module,
      Provider<DoctorDatabase> dbProvider) {
    return new RoomModule_ProvideDaoFactory(module, dbProvider);
  }

  public static DoctorDao provideDao(RoomModule instance, DoctorDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideDao(db));
  }
}
