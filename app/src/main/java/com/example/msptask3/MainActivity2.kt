package com.example.msptask3

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.msptask3.Data.User
import com.example.msptask3.Data.UserDatabase
import com.example.msptask3.Data.UserRepo

lateinit var ButtonSignUp:Button
lateinit var NameEditText2:EditText
lateinit var PasswordEditText2:EditText
lateinit var PhoneEditText2:EditText


class MainActivity2 : AppCompatActivity() {
    val database:UserDatabase by lazy {  UserDatabase.getDatabase(baseContext)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


         var repo:UserRepo = UserRepo(database.dao())
        setContentView(R.layout.activity_main2)


        ButtonSignUp=findViewById(R.id.bt3)
        NameEditText2=findViewById(R.id.ed4)
        PasswordEditText2=findViewById(R.id.ed5)
        PhoneEditText2=findViewById(R.id.ed6)
        ButtonSignUp.setOnClickListener{
//            if (!= NameEditText2.text.toString()){
//                Toast.makeText(this, "Sucssful", Toast.LENGTH_SHORT).show()
//            }
//            else{
//                Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show()
//            }
        }


    }
}