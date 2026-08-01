package com.werhes.museeks

import android.app.Application

class MuseeksApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MuseeksApplication
            private set
    }
}