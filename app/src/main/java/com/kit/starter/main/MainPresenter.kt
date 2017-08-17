package com.kit.starter.main

import io.reactivex.disposables.CompositeDisposable

class MainPresenter constructor(val disposable: CompositeDisposable, val view: MainConstract.View) : MainConstract.Presenter {
    override fun subscribe() {

    }

    override fun unsubscribe() {
        disposable.clear()
    }
}