package com.alim.finalhalftask

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative.*

class Relative : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        val nama=intent.getStringExtra("Nama")
        val identitas=intent.getStringExtra("Identitas")
        dataterima.setText(nama+"\n"+identitas)
    }

}
