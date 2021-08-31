package com.shamilov.auth_impl.di

import com.shamilov.auth_api.AuthApi
import com.shamilov.auth_api.AuthInteractor
import com.shamilov.auth_impl.domain.interactor.AuthInteractorImpl
import dagger.Binds
import dagger.Component
import dagger.Module
import javax.inject.Scope

@Component(modules = [AuthModule::class])
interface AuthApiComponent : AuthApi {

    @Component.Factory
    interface Factory {
        fun create(): AuthApiComponent
    }
}
