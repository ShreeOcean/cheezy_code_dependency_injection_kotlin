package com.ocean.cheezycodedidemo

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}


class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d("TAG-user-repository", "saveUser: User saved in DB")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG-firebase-repository", "saveUser: User saved in Firebase")
    }

}