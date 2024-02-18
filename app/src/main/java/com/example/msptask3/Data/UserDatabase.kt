package com.example.msptask3.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [User::class], version = 7, exportSchema = false)
abstract class UserDatabase:RoomDatabase() {
    abstract fun dao():Dao
    companion object{
      @Volatile
      private var INSTANCE:UserDatabase?=null
        fun getDatabase(context: Context):UserDatabase{
            return INSTANCE ?: synchronized(this){
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                   " User"
                ).allowMainThreadQueries().fallbackToDestructiveMigration()
                .build()
                INSTANCE=instance
                return instance
            }
        }


    }
}