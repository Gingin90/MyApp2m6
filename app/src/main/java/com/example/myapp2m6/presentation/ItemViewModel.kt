package com.example.myapp2m6.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.myapp2m6.data.Repositorio
import com.example.myapp2m6.data.local.DataBase
import com.example.myapp2m6.data.local.Item
import kotlinx.coroutines.launch


class ItemViewModel(application: Application) : AndroidViewModel(application) {
    private val repositorio: Repositorio

    init {
        val dao = DataBase.getDatabase(application).getItemDao()
        repositorio = Repositorio(dao)
    }

    fun getAllItems(): LiveData<List<Item>> = repositorio.getItem()

    fun insertItem(nombre: String, precio: Int, cantidad: Int) = viewModelScope.launch {
        val item = Item( nombre, precio, cantidad)
        repositorio.insertItem(item)
    }

    }

