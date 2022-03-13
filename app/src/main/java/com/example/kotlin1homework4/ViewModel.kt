package com.example.kotlin1homework4

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MediatorLiveData

class ViewModel :ViewModel(){

    private var counter =0
    val counterDisplayNumberOfClick = MediatorLiveData<Int>()
    val counterDisplayHistory = MediatorLiveData<ArrayList<String>>()
    val list  = arrayListOf<String>()


    fun onIncrementCLick(){
        counter++
        counterDisplayNumberOfClick.value = counter
        list.add("+")
        counterDisplayHistory.value = list
    }

    fun onDecrementCLick(){
        counter--
        counterDisplayNumberOfClick.value = counter
        list.add("-")
        counterDisplayHistory.value = list
    }



}
