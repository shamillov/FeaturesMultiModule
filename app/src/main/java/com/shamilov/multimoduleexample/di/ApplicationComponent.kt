package com.shamilov.multimoduleexample.di

import android.content.Context
import com.shamilov.common.di.BaseInjector
import com.shamilov.common.di.ComponentFactory
import com.shamilov.multimoduleexample.App
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Scope
import javax.inject.Singleton

@Scope
@Retention(AnnotationRetention.RUNTIME)
internal annotation class ApplicationScope

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent : BaseInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}

@Module
interface ApplicationModule {
    @Binds
    @ApplicationScope
    fun provideComponentFactory(api: ComponentFactoryImpl): ComponentFactory
}