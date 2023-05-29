package uz.gita.medica.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import uz.gita.medica.data.source.local.room.local.DoctorDatabase;

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
public final class RoomModule_ProvideBookDatabaseFactory implements Factory<DoctorDatabase> {
  private final RoomModule module;

  public RoomModule_ProvideBookDatabaseFactory(RoomModule module) {
    this.module = module;
  }

  @Override
  public DoctorDatabase get() {
    return provideBookDatabase(module);
  }

  public static RoomModule_ProvideBookDatabaseFactory create(RoomModule module) {
    return new RoomModule_ProvideBookDatabaseFactory(module);
  }

  public static DoctorDatabase provideBookDatabase(RoomModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBookDatabase());
  }
}
