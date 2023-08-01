package com.example.myapp2m6.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.myapp2m6.R
import com.example.myapp2m6.databinding.FragmentoListadoBinding



class FragmentoListado : Fragment() {
    private lateinit var binding : FragmentoListadoBinding
    private val itemViewModel : ItemViewModel by activityViewModels()
    val adapter = Adapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =FragmentoListadoBinding.inflate(layoutInflater,container, false)
    initLista()

        return binding.root
    }

    private fun initLista() {
       itemViewModel.getAllItems().observe(viewLifecycleOwner){
           adapter.setData(it)

       }
        binding.rv.adapter=adapter
        binding.btnVolver.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_fragmentoListado_to_fragmentAgregar)

        }

    }
}






