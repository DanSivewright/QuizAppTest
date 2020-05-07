package com.example.quizapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.fragment_login.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)


        val email = email_register.text.toString()
        val password = password_register.text.toString()

        Log.d("EmailController", "Email is $email")
        Log.d("PasswwordController", "Password is $password")
    }
}
