package com.kit.starter.di

import com.kit.starter.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by TuxVn on 10/7/17.
 * component for whole app
 */
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        CompositeDisposableModule::class,
        CrashlyticsModule::class,
        ActivityBuilder::class
))
interface AppComponent {
    fun inject(app: MyApplication)
}