package com.alim.finalhalftask

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LL.setOnClickListener {
            val pindah = Intent(this, Linear::class.java)
            startActivity(pindah)
        }
        RL.setOnClickListener {
            val pindah = Intent(this, Relative::class.java)
            startActivity(pindah)
        }
        CL.setOnClickListener {
            val pindah = Intent(this, Constraint::class.java)
            startActivity(pindah)
        }
    }
}
