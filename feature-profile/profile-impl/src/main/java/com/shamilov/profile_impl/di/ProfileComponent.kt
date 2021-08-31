package com.shamilov.profile_impl.di

import com.shamilov.auth_api.AuthApi
import com.shamilov.common.di.BaseInjector
import com.shamilov.profile_impl.ui.ProfileFragment
import dagger.Component
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
internal annotation class ProfileScope

@ProfileScope
@Component(dependencies = [AuthApi::class])
internal interface ProfileComponent : BaseInjector<ProfileFragment> {
    @Component.Factory
    interface Factory {
        fun create(
            authApi: AuthApi
        ): ProfileComponent
    }
}