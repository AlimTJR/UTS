package com.alim.finalhalftask

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_linear.*

class Linear : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        prof.setOnClickListener {
            val uri = Uri.parse("https://www.instagram.com/alim.tjr")
            val i = Intent(Intent.ACTION_VIEW, uri)
            i.setPackage("com.instagram.android")
            try {
                startActivity(i)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/alim.tjr")
                    )
                )
            }
        }
        cam.setOnClickListener {  }
        mowida.setOnClickListener { val intent = Intent(this, Relative::class.java)
            intent.putExtra("Username","m Alim Tajri")
            intent.putExtra("password",124123213)
            startActivity(intent) }
    }
}
