package uz.gita.medica.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.medica.domain.repository.AuthRepository
import uz.gita.medica.domain.repository.HomeRepository
import uz.gita.medica.domain.repository.ProfileRepository
import uz.gita.medica.domain.repository.impl.AuthRepositoryImpl
import uz.gita.medica.domain.repository.impl.HomeRepositoryImpl
import uz.gita.medica.domain.repository.impl.ProfileRepositoryImpl
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindRepository(impl: ProfileRepositoryImpl): ProfileRepository


    @[Binds Singleton]
    fun bindAuthRepository(impl: AuthRepositoryImpl): AuthRepository

    @[Binds Singleton]
    fun bindBookRepository(impl: HomeRepositoryImpl): HomeRepository

}