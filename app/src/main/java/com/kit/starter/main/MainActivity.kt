package com.kit.starter.main

import com.kit.starter.BaseActivity
import com.kit.starter.R
import com.kit.starter.di.CompositeDisableModule

class MainActivity : BaseActivity<MainPresenter>(), MainConstract.View {
    override fun getLayoutContent(): Int = R.layout.activity_main

    override fun initView() {

    }

    override fun injectDI() {
        DaggerMainComponent.builder()
                .compositeDisableModule(CompositeDisableModule())
                .mainModule(MainModule(this))
                .build()
                .inject(this)
    }
}
