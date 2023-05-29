package uz.gita.medica.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/medica/di/RoomModule;", "", "()V", "provideBookDatabase", "Luz/gita/medica/data/source/local/room/local/DoctorDatabase;", "provideDao", "Luz/gita/medica/data/source/local/room/local/dao/DoctorDao;", "db", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RoomModule {
    
    public RoomModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final uz.gita.medica.data.source.local.room.local.DoctorDatabase provideBookDatabase() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final uz.gita.medica.data.source.local.room.local.dao.DoctorDao provideDao(@org.jetbrains.annotations.NotNull
    uz.gita.medica.data.source.local.room.local.DoctorDatabase db) {
        return null;
    }
}