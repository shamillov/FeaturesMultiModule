package com.shamilov.profile_impl.di

import com.shamilov.profile_api.ProfileApi
import com.shamilov.profile_api.ProfileFragmentProvider
import com.shamilov.profile_impl.ProfileFragmentProviderImpl
import dagger.Binds
import dagger.Component
import dagger.Module

@Component(modules = [ProfileModule::class])
interface ProfileApiComponent : ProfileApi {
    @Component.Factory
    interface Factory {
        fun create(
        ): ProfileApiComponent
    }
}

@Module
internal interface ProfileModule {
    @Binds
    fun bindsProfileFragmentProvider(api: ProfileFragmentProviderImpl) : ProfileFragmentProvider
}