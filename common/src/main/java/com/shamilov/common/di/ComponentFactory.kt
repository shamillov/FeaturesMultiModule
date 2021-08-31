package com.shamilov.common.di

import kotlin.reflect.KClass

interface ComponentFactory {
    fun <T : Any> get(clazz: Class<T>): T
    fun <T : Any> get(kClass: KClass<T>): T = get(kClass.java)
}