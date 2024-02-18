package com.example.msptask3.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(indices = [Index(value = ["PhoneNumber"],
unique = true)],tableName = "User")
 data class User (

     var Name:String,
     var Password:String,
     @PrimaryKey
     @ColumnInfo(name="PhoneNumber")
     var PhoneNumber:Int,


 )
