package com.example.msptask3.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_table")
 data class User (

     var Name:String,
     var Password:String,
     @PrimaryKey
     var PhoneNumber:Int,


 )
