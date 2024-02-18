package com.example.msptask3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.msptask3.Data.UserDatabase
import com.example.msptask3.Data.UserRepo

class LogInActivity : AppCompatActivity() {
     lateinit var LoginButton:Button
     lateinit var SignupButton:Button
     lateinit var NameEdittext:EditText
     lateinit var PasswordEdittext:EditText
     lateinit var PhoneEdittext:EditText


     val database:UserDatabase by lazy{
         UserDatabase.getDatabase(baseContext)
     }

    lateinit var repo:UserRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        repo = UserRepo(database.dao())

        LoginButton=findViewById(R.id.bt1)
        SignupButton=findViewById(R.id.btt2)
        NameEdittext=findViewById(R.id.ed1)
        PasswordEdittext=findViewById(R.id.ed2)
        PhoneEdittext=findViewById(R.id.ed3)


        SignupButton.setOnClickListener{
            val myintent=Intent(this ,MainActivity2::class.java)
            startActivity(myintent)
        }
        LoginButton.setOnClickListener{
            if (repo.SelectPassword(Integer.parseInt(PhoneEdittext.text.toString())) == Integer.parseInt(PasswordEdittext.text.toString())){
                val myintent2=Intent(this,AfterLogIn::class.java)
                startActivity(myintent2)
                Toast.makeText(this, "login succefully", Toast.LENGTH_SHORT).show()

            }else {
                Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()

            }
        }

    }

}