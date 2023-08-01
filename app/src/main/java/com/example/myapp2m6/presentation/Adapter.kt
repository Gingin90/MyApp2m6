package com.example.myapp2m6.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp2m6.data.local.Item
import com.example.myapp2m6.databinding.ItemlaBinding

class Adapter: RecyclerView.Adapter <Adapter.ItemViewHolder> (){
    lateinit var binding : ItemlaBinding

    private val listItem = mutableListOf<Item>()

    class ItemViewHolder( val v : ItemlaBinding) :RecyclerView.ViewHolder(v.root) {


        fun render(item: Item) {

            v.tvNombre.text = "compraste" + item.nombre
            v.tvPrecio.text ="Precio unitario" + item.precio.toString()
            v.tvCantidad.text ="Cantidad" +item.cantidad.toString()
            v.tvTotal.text = (item.precio * item.cantidad).toString()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ItemViewHolder {
       binding = ItemlaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ItemViewHolder, position: Int) {
        val item = listItem[position]
        holder.render(item)
    }

    fun setData(listaItem: List<Item>){
        this.listItem.clear()
        this.listItem.addAll(listaItem)
        notifyDataSetChanged()

    }

    override fun getItemCount(): Int {
        return listItem.size
    }
}