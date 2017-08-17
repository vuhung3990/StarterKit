package com.kit.starter.main

import dagger.Component

/**
 * Created by HungVu on 8/18/17.
 */
@Component(modules = arrayOf(
        MainModule::class
))
interface MainComponent {
    fun inject(activity: MainActivity)
}