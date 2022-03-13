package com.example.kotlin1homework4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1homework4.R
import com.example.kotlin1homework4.ViewModel
import com.example.kotlin1homework4.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var viewModel: ViewModel

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModel::class.java)
        viewModel.counterDisplayNumberOfClick.observe(requireActivity()){
            binding.numberOfCLicksTv.text =it.toString()
        }
    }


}