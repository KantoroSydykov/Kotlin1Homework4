package com.example.kotlin1homework4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1homework4.R
import com.example.kotlin1homework4.ViewModel
import com.example.kotlin1homework4.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: ViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(requireActivity()).get(ViewModel::class.java)   //connect vm to life cycle activity
        initListeners()

    }

    private fun initListeners() {
        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementCLick()

        }

        binding.btnMinus.setOnClickListener {
            viewModel.onDecrementCLick()
        }
    }

}