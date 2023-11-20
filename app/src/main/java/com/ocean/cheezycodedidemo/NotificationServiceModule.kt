package com.ocean.cheezycodedidemo

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    //@Named("message")
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MsgService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return MsgService()
    }
}