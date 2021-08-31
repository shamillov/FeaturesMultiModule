package com.shamilov.auth_impl.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import com.shamilov.auth_api.AuthInteractor
import com.shamilov.auth_impl.R
import com.shamilov.auth_impl.di.DaggerAuthComponent
import com.shamilov.common.di.getComponentFactory
import com.shamilov.profile_api.ProfileApi
import com.shamilov.profile_api.ProfileFragmentProvider
import javax.inject.Inject

class AuthFragment : Fragment(R.layout.fragment_auth) {

    @Inject
    lateinit var authInteractor: AuthInteractor

    @Inject
    lateinit var profileFragmentProvider: ProfileFragmentProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        initDI()
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val signIn: Button = view.findViewById(R.id.btn_sing_in)

        signIn.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .add(R.id.container, profileFragmentProvider.provideProfileFragment())
                .hide(this)
                .addToBackStack("")
                .commit()
        }
    }

    private fun initDI() {
        val profileApi = getComponentFactory().get(ProfileApi::class)

        DaggerAuthComponent
            .factory()
            .create(profileApi)
            .inject(this)
    }
}