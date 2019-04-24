package com.alim.finalhalftask

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative.*

class Relative : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        val nama=intent.getStringExtra("Username")
        val password=intent.getIntExtra("password",0)
        dataterima.setText("User Name ="+ nama + ",\nPassword ="+password)
    }

}
