package com.ocean.cheezycodedidemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule { //made abstract class later

//    @Provides
//    /*fun getFirebaseRepository() : UserRepository{
//        return FirebaseRepository()
//    }*/
//    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository{
//        return sqlRepository
//    }

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}