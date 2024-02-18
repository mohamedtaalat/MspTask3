package com.example.msptask3.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.util.jar.Attributes.Name

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun InsertUser(user: User)


    @Query("Select*from User")
    fun SelectAll():List<User>
    @Query("Select password from User where PhoneNumber = :phonenumber")
    fun GetPassword(phonenumber:Int):Int
    @Query("Select PhoneNumber from User where PhoneNumber = :phonenumber")
    fun GetPhoneNumber(phonenumber:Int):Int

}