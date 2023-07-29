package com.example.myapp2m6.data.local

import android.content.ClipData
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



    @Database (entities = [Item::class], version = 1)
      abstract class DataBase : RoomDatabase() {
          abstract fun getItemDao(): ItemDao

          companion object {
              @Volatile
              private var INSTANCE: Database? = null

              fun getDatabase(context: Context): Database {
                  val tempInstance = INSTANCE
                  if (tempInstance != null) {
                      return tempInstance
                  }
                  synchronized(this) {
                      val instance = Room.databaseBuilder(
                          context.applicationContext,
                          DataBase::class.java,
                          "database"
                      ).build()

                      INSTANCE = instance
                      return instance
                  }
              }
          }
      }
