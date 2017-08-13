package com.kit.starter

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric


/**
 * Created by HungVu on 8/14/17.
 * Application class is the object that has the full lifecycle of your application. It is your highest layer as an application
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // crash reporting
        Fabric.with(this, Crashlytics())
        // to detect leak memory
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)
    }
}