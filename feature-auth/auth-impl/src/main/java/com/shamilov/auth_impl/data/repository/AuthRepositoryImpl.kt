package com.shamilov.auth_impl.data.repository

import com.shamilov.auth_impl.domain.repository.AuthRepository
import java.util.*
import javax.inject.Inject

internal class AuthRepositoryImpl @Inject constructor() : AuthRepository {
    override fun getToken() = UUID.randomUUID().toString()
}