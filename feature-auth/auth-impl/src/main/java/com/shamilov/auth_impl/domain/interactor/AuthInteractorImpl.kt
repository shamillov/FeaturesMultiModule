package com.shamilov.auth_impl.domain.interactor

import com.shamilov.auth_api.AuthInteractor
import com.shamilov.auth_impl.domain.repository.AuthRepository
import java.util.*
import javax.inject.Inject

internal class AuthInteractorImpl @Inject constructor(
    private val authRepository: AuthRepository
) : AuthInteractor {
    override fun getToken() = authRepository.getToken()
}