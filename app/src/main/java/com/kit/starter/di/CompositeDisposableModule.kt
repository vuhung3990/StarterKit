package com.kit.starter.di

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by HungVu on 6/28/17.
 * provide composite disposable object for presenter
 */
@Module
class CompositeDisposableModule {
    @Provides
    fun provideCompositeDisposable() = CompositeDisposable()
}