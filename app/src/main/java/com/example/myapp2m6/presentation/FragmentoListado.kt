package com.example.myapp2m6.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.myapp2m6.R
import com.example.myapp2m6.databinding.FragmentoListadoBinding


class FragmentoListado : Fragment() {
    private lateinit var binding : FragmentoListadoBinding
    private val viewModel : ItemViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =FragmentoListadoBinding.inflate(layoutInflater,container, false)

    initRecyclerView()
        loadData()
        initListener()

        return binding.root
    }

    private fun initListener() {
        TODO("Not yet implemented")
    }

    private fun loadData() {
        TODO("Not yet implemented")
    }

    private fun initRecyclerView() {
        TODO("Not yet implemented")
    }


}

