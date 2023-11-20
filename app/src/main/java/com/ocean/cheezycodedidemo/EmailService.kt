package com.ocean.cheezycodedidemo

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, from : String, body : String?)
}

class EmailService @Inject constructor() : NotificationService{

    /*fun send(email: String, s: String, s1: String) {

    }*/
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG-email-service", "msg: Email sent")
    }
}

class  MsgService : NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG-msg-service", "msg: Message sent")
    }

}