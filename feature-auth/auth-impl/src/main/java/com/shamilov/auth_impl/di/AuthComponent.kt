package com.shamilov.auth_impl.di

import com.shamilov.auth_impl.ui.AuthFragment
import com.shamilov.common.di.BaseInjector
import com.shamilov.profile_api.ProfileApi
import dagger.Component
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
internal annotation class AuthScope

@AuthScope
@Component(
        modules = [AuthModule::class],
        dependencies = [ProfileApi::class]
)
internal interface AuthComponent : BaseInjector<AuthFragment> {
    @Component.Factory
    interface Factory {
        fun create(
                profileApi: ProfileApi
        ): AuthComponent
    }
}
