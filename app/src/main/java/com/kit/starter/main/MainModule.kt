package com.kit.starter.main

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class MainModule {
    @Provides
    fun provideView(view: MainActivity): MainContract.View = view

    @Provides
    fun providePresenter(disposable: CompositeDisposable, view: MainContract.View): MainPresenter = MainPresenter(disposable, view)
}