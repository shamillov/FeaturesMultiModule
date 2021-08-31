package com.shamilov.profile_impl

import com.shamilov.profile_api.ProfileFragmentProvider
import com.shamilov.profile_impl.ui.ProfileFragment
import javax.inject.Inject

internal class ProfileFragmentProviderImpl @Inject constructor() : ProfileFragmentProvider {
    override fun provideProfileFragment() = ProfileFragment.newInstance()
}