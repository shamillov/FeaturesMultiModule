package com.shamilov.auth_impl.domain.repository

internal interface AuthRepository {
    fun getToken(): String
}