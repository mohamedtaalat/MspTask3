package com.example.msptask3.Data

import androidx.lifecycle.LiveData

class UserRepo(private val dao: Dao) {

    val selectall:List<User> =dao.SelectAll()
    fun adduser(user: User){
        dao.InsertUser(user)
    }
    fun SelectPassword(PhoneNumber:String){
        dao.GetPassword(PhoneNumber)
    }


}