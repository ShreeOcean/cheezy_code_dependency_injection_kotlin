package com.ocean.cheezycodedidemo

import javax.inject.Inject
import javax.inject.Named


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    //private val emailService: EmailService,
    /*@Named("message")*/ @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email : String, password : String){
        userRepository.saveUser(email,password)
//        emailService.send(email, "no-reply@cheezyCode.com", "User Registered")

        /** Here after implementing notification service the state of service changes dynamically
         *  cause email and message both can be send through */
        notificationService.send(email, "no-reply@cheezyCode.com", "User Registered")
    }
}