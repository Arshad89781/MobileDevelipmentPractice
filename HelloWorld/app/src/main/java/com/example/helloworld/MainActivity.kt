package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCountDisplayView = findViewById<TextView>(R.id.clickCountView)
        val clickMeButton = findViewById<TextView>(R.id.clickButton)
        val userNameTextInputView = findViewById<TextInputLayout>(R.id.nameText)

        //val numbersMap = mutableMapOf("random" to 0 )
        //numbersMap.plus(Pair("random",1))
        //numbersMap.putIfAbsent("Abc",1)

        clickMeButton.setOnClickListener{

            val userName =  userNameTextInputView.editText?.text?.toString()
            val maskedUserName =
                if(userName.isNullOrEmpty()) "Somebody"
                else userName
            //val maskedUserName=
                //if (userName in numbersMap) numbersMap.plus(Pair("random",1))


            clickCount++
            clickCountDisplayView.text = "$maskedUserName Clicked $clickCount times"

        }












    }
}