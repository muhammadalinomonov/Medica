package uz.gita.medica.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.medica.data.source.local.sharedpref.MySharedPref
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedPrefModule {
    @Provides
    @Singleton
    fun provideSharedPref(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideMySharedPref(pref: SharedPreferences): MySharedPref = MySharedPref(pref)
}