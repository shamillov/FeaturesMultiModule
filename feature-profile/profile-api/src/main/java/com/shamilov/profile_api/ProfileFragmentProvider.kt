package com.shamilov.profile_api

import androidx.fragment.app.Fragment

interface ProfileFragmentProvider {
    fun provideProfileFragment(): Fragment
}