package com.farzin.newdigikala.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import com.farzin.newdigikala.data.datastore.DataStoreRepository
import com.farzin.newdigikala.util.Constants.PERSIAN_LANG
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class DataStoreViewModel @Inject constructor(
    private val repo: DataStoreRepository,
) : ViewModel() {


    companion object {
        const val USER_LANGUAGE_KEY = "USER_LANGUAGE_KEY"
        const val USER_TOKEN_KEY = "USER_TOKEN_KEY"
        const val USER_ID_KEY = "USER_ID_KEY"
        const val USER_PHONE_KEY = "USER_PHONE_KEY"
        const val USER_PASSWORD_KEY = "USER_PASSWORD_KEY"
        const val USER_NAME_KEY = "USER_NAME_KEY"
        const val USER_ADDRESS_INDEX_KEY = "USER_ADDRESS_INDEX_KEY"
    }

    fun saveUserLanguage(value: String) {
        viewModelScope.launch {
            repo.putString(USER_LANGUAGE_KEY, value)
        }
    }

    fun getUserLanguage(): String = runBlocking {
        repo.getString(USER_LANGUAGE_KEY) ?: PERSIAN_LANG
    }

    fun saveUserToken(value: String) {
        viewModelScope.launch {
            repo.putString(USER_TOKEN_KEY, value)
        }
    }

    fun getUserToken(): String? = runBlocking {
        repo.getString(USER_TOKEN_KEY)
    }

    fun saveUserId(value: String) {
        viewModelScope.launch {
            repo.putString(USER_ID_KEY, value)
        }
    }

    fun getUserId(): String? = runBlocking {
        repo.getString(USER_ID_KEY)
    }

    fun saveUserPhoneNumber(value: String) {
        viewModelScope.launch {
            repo.putString(USER_PHONE_KEY, value)
        }
    }

    fun getUserPhoneNumber(): String? = runBlocking {
        repo.getString(USER_PHONE_KEY)
    }


    fun saveUserPassword(value: String) {
        viewModelScope.launch {
            repo.putString(USER_PASSWORD_KEY, value)
        }
    }

    fun getUserPassword(): String? = runBlocking {
        repo.getString(USER_PASSWORD_KEY)
    }

    fun saveUserName(value: String) {
        viewModelScope.launch {
            repo.putString(USER_NAME_KEY, value)
        }
    }

    fun getUserName(): String? = runBlocking {
        repo.getString(USER_NAME_KEY)
    }


    fun saveUserAddressIndex(value: String) {
        viewModelScope.launch {
            repo.putString(USER_ADDRESS_INDEX_KEY, value)
        }
    }

    fun getUserAddressIndex(): String? = runBlocking {
        repo.getString(USER_ADDRESS_INDEX_KEY)
    }

}