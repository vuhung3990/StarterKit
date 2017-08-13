package com.kit.starter.di

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * inject activity context
 */
@Module
class ContextModule(val context: Context) {
    @Provides
    fun provideContext() = context
}