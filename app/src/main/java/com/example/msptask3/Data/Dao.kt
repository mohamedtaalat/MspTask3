package com.example.msptask3.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun InsertUser(user: User)
    @Query("Select*from user_table")
    fun SelectAll():LiveData<List<User>>
    @Query("Select password from User_table where PhoneNumber = :phonenumber")
    fun GetPassword(phonenumber:String):String
}