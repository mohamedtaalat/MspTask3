package com.example.msptask3.Data

import androidx.lifecycle.LiveData
import java.util.jar.Attributes.Name

class UserRepo(private val dao: Dao) {

    val selectall:List<User> =dao.SelectAll()
    fun adduser(user: User){
        dao.InsertUser(user)


    }
    fun SelectPassword(PhoneNumber:Int):Int{
        return dao.GetPassword(PhoneNumber)
    }
    fun GetPhoneNumber(PhoneNumber:Int):Int{
        return dao.GetPhoneNumber(PhoneNumber)
    }




}