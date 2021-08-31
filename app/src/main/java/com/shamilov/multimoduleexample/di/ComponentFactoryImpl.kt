package com.shamilov.multimoduleexample.di

import com.shamilov.auth_api.AuthApi
import com.shamilov.auth_impl.di.DaggerAuthApiComponent
import com.shamilov.common.di.ComponentFactory
import com.shamilov.profile_api.ProfileApi
import com.shamilov.profile_impl.di.DaggerProfileApiComponent
import java.lang.IllegalArgumentException
import javax.inject.Inject

typealias ComponentHolder<T> = () -> T

class ComponentFactoryImpl @Inject constructor() : ComponentFactory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : Any> get(clazz: Class<T>): T {
        return componentsMap[clazz] as? T ?: throw IllegalArgumentException("Wrong api class")
    }

    private val componentsMap: MutableMap<Any, Any> = mutableMapOf(
        AuthApi::class.java to DaggerAuthApiComponent.create(),
        ProfileApi::class.java to DaggerProfileApiComponent.create()
    )

}