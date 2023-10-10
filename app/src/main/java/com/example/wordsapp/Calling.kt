package com.example.wordsapp

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import android.Manifest

class Calling: AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.callingphone)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        checkPermissions()
        button.setOnClickListener{
            val phoneNumber = editText.text.toString()
            if(phoneNumber.isNotEmpty()){
                val calIntent = Intent(Intent.ACTION_CALL)
                calIntent.data = Uri.parse("tel: $phoneNumber")
                startActivity(calIntent)
            }
        }


    }

    private fun checkPermissions() {
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE),101)
        }
    }

}