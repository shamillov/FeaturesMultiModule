package com.shamilov.auth_impl.di

import com.shamilov.auth_api.AuthInteractor
import com.shamilov.auth_impl.data.repository.AuthRepositoryImpl
import com.shamilov.auth_impl.domain.interactor.AuthInteractorImpl
import com.shamilov.auth_impl.domain.repository.AuthRepository
import dagger.Binds
import dagger.Module

@Module
internal interface AuthModule {

    @Binds
    fun bindAuthInteractor(api: AuthInteractorImpl): AuthInteractor

    @Binds
    fun bindAuthRepository(api: AuthRepositoryImpl): AuthRepository
}