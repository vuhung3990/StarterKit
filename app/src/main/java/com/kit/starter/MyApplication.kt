package com.kit.starter

import android.app.Activity
import android.app.Application
import com.crashlytics.android.Crashlytics
import com.kit.starter.di.DaggerAppComponent
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.fabric.sdk.android.Fabric
import javax.inject.Inject


/**
 * Created by HungVu on 8/14/17.
 * Application class is the object that has the full lifecycle of your application. It is your highest layer as an application
 */
class MyApplication : Application(), HasActivityInjector {
    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    @Inject
    lateinit var crashlytics: Crashlytics

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .build()
                .inject(this)

        // crash reporting
        Fabric.with(this, crashlytics)
        // to detect leak memory
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)
    }
}