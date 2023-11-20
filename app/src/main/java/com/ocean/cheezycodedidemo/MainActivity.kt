package com.ocean.cheezycodedidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    @Inject
    lateinit var emailService: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        /*val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()
        */

        component.inject(this)
        userRegistrationService.registerUser("cheezyCode@gmail.com", "11111")
    }
}