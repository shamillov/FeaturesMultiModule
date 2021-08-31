package com.shamilov.common.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.getComponentFactory(): ComponentFactory {
    return (application as ApplicationWrapper).componentFactory
}

fun Fragment.getComponentFactory(): ComponentFactory {
    return requireActivity().getComponentFactory()
}