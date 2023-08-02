package com.example.myapp2m6.presentation
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myapp2m6.R
import com.example.myapp2m6.databinding.FragmentAgregarBinding


class FragmentAgregar : Fragment() {

    private lateinit var binding : FragmentAgregarBinding
    private val itemViewModel: ItemViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAgregarBinding.inflate(layoutInflater, container, false)

        initListener()

        return binding.root
    }

    private fun initListener() {
     binding.btnGuardar.setOnClickListener{

         val nombre = binding.editTextNombre.text.toString()
         val cantidad = binding.editTextCantidad.text.toString().toInt()
         val precio = binding.editTextPrecio.text.toString().toInt()
         itemViewModel.insertItem(nombre, precio,cantidad)
         findNavController().navigate(R.id.action_fragmentAgregar_to_fragmentoListado)

       }
     }
  }








