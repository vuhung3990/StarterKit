package com.kit.starter.main

import com.kit.starter.BaseActivity
import com.kit.starter.R
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.RuntimeException

class MainActivity : BaseActivity<MainPresenter>(), MainContract.View {
    override fun getLayoutContent(): Int = R.layout.activity_main

    override fun initView() {
        force_crash.setOnClickListener { throw RuntimeException("sample crash") }
    }
}
