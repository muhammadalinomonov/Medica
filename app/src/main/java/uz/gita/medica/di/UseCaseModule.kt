package uz.gita.medica.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.medica.domain.usecase.LoginUseCase
import uz.gita.medica.domain.usecase.ProfileUseCase
import uz.gita.medica.domain.usecase.SignInUseCase
import uz.gita.medica.domain.usecase.UseCase
import uz.gita.medica.domain.usecase.VerifyUseCase
import uz.gita.medica.domain.usecase.impl.LoginUseCaseImpl
import uz.gita.medica.domain.usecase.impl.ProfileUseCaseImpl
import uz.gita.medica.domain.usecase.impl.SignInUseCaseImpl
import uz.gita.medica.domain.usecase.impl.UseCaseImpl
import uz.gita.medica.domain.usecase.impl.VerifyUseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {
    @[Binds Singleton]
    fun bindProfileUseCase(impl: ProfileUseCaseImpl): ProfileUseCase

    @[Binds Singleton]
    fun bindSignInUseCase(impl: SignInUseCaseImpl): SignInUseCase

    @[Binds Singleton]
    fun bindVerifyUseCase(impl: VerifyUseCaseImpl): VerifyUseCase

    @[Binds Singleton]
    fun bindLoginUseCase(impl: LoginUseCaseImpl): LoginUseCase


    @[Binds Singleton]
    fun bindUseCase(impl: UseCaseImpl): UseCase
}