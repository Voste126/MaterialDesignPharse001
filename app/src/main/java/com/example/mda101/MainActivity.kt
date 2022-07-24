package com.example.mda101

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


lateinit var image:ImageView
lateinit var logo:TextView
lateinit var slogan:TextView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //how to hide the status bar
        //while noting that the action bar is hidden in themes xml file


        setContentView(R.layout.activity_main)

        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        Handler().postDelayed({
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.

//create local variables
        var topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        var botanim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        //add hooks
       image=findViewById(R.id.imageView)
        logo=findViewById(R.id.txt_garage)
        slogan=findViewById(R.id.txt_ad)

        image.setAnimation(topAnim)
        logo.setAnimation(botanim)
        slogan.setAnimation(botanim)



    }
}





