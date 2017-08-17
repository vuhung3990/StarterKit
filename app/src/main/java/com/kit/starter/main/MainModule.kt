package com.kit.starter.main

import com.kit.starter.di.CompositeDisableModule
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by HungVu on 8/18/17.
 */
@Module(includes = arrayOf(CompositeDisableModule::class))
class MainModule(val view: MainConstract.View) {

    @Provides
    fun provideView(): MainConstract.View = view

    @Provides
    fun providePresenter(disposable: CompositeDisposable, view: MainConstract.View): MainPresenter = MainPresenter(disposable, view)
}