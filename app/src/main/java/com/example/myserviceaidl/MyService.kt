package com.example.myserviceaidl

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {



    private val aidl = object : SepratePackage.IAidlInterface.Stub() {

        override fun addNumbers(firstNumber: Int, seconfNumber: Int): Int {
            return firstNumber+seconfNumber
        }
    }


    override fun onBind(intent: Intent): IBinder {
        return aidl
    }
}