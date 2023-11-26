package com.mmeso.tryproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var signUpButton:Button  = this.findViewById(R.id.signUpButton)

    signUpButton.setOnClickListener{
        val intent = Intent(this,LoginActivity::class.java)

        this.startActivity(intent)
    }




    }
}