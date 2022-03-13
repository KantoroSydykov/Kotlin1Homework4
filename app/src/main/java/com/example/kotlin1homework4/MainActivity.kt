package com.example.kotlin1homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1homework4.adapters.ViewPagerAdapter
import com.example.kotlin1homework4.databinding.ActivityMainBinding
import com.example.kotlin1homework4.fragments.FirstFragment
import com.example.kotlin1homework4.fragments.SecondFragment
import com.example.kotlin1homework4.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ViewPagerAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewPager()
    }

    private fun initViewPager() {
        adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.add(FirstFragment(),"Доступные операции")
        adapter.add(SecondFragment(),"Количесво нажатий")
        adapter.add(ThirdFragment(),"История операций ")

        binding.viewpager.adapter = adapter

        binding.tabLayout.setupWithViewPager(binding.viewpager)


    }


}