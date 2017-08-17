package com.kit.starter.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by HungVu on 6/28/17.
 * for multiple stream
 */
@Module
class CompositeDisableModule {
    @Provides
    fun provideCompositeDisposable() = CompositeDisposable()
}