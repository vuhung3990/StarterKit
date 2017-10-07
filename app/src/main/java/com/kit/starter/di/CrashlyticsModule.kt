package com.kit.starter.di

import com.crashlytics.android.Crashlytics
import dagger.Module
import dagger.Provides

/**
 * Created by stupidman on 9/25/17.
 * provide Crashlytics object for crash report
 */
@Module
class CrashlyticsModule {
    @Provides
    fun provideCrashlytics() = Crashlytics()
}