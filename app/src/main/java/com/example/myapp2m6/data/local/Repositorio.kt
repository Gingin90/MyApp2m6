package com.example.myapp2m6.data

import androidx.lifecycle.LiveData
import com.example.myapp2m6.data.local.Item
import com.example.myapp2m6.data.local.ItemDao

class Repositorio(private val itemDao:ItemDao) {
   suspend fun  insertItem(item:Item){
        itemDao.insertItem(item)

    }
    fun getItem():
        LiveData<List<Item>>{
            return itemDao.getAllItems()


    }
}