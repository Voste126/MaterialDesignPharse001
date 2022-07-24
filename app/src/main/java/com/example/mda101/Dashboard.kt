package com.example.mda101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

lateinit var logo_image: ImageView
class Dashboard : AppCompatActivity() {
    var buttongo:Button ?=null
    var buttonsignup:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var fade = AnimationUtils.loadAnimation(this, R.anim.fade_out)

        logo_image=findViewById(R.id.logo_image)
        logo_image.setAnimation(fade)
        buttongo=findViewById(R.id.btn_go)
        buttonsignup=findViewById(R.id.btn_signup)


        buttongo!!.setOnClickListener {
            val go1= Intent(this,com.example.mda101.Signup::class.java)
            startActivity(go1)
        }
        buttonsignup!!.setOnClickListener {
            val sign= Intent(this,com.example.mda101.Signup::class.java)
            startActivity(sign)
        }


    }
}