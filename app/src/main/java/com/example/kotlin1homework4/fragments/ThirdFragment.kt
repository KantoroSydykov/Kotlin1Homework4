package com.example.kotlin1homework4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1homework4.R
import com.example.kotlin1homework4.ViewModel
import com.example.kotlin1homework4.adapters.RvAdapter
import com.example.kotlin1homework4.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: ViewModel
    private lateinit var adapter: RvAdapter
    private val fullList = mutableListOf<String>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModel::class.java)

        viewModel.counterDisplayHistory.observe(requireActivity()){

            adapter = RvAdapter(it)
            binding.operationsRv.adapter =adapter

        }
    }
}