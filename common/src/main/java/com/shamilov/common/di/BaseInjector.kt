package com.shamilov.common.di

interface BaseInjector<T> {
    fun inject(injected: T)
}