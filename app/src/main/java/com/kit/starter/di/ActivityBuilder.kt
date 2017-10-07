package com.kit.starter.di

import com.kit.starter.main.MainActivity
import com.kit.starter.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by TuxVn on 10/7/17.
 * bind all activity
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun bindMainActivity(): MainActivity
}