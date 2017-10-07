package com.kit.starter.main

import android.util.Log
import io.reactivex.disposables.CompositeDisposable

class MainPresenter constructor(val disposable: CompositeDisposable, val view: MainContract.View) : MainContract.Presenter {
    override fun subscribe() {
        Log.d("aaaa", "sub")
    }

    override fun unsubscribe() {
        disposable.clear()
        Log.d("aaaa", "un sub")
    }
}