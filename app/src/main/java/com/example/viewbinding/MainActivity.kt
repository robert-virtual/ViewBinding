package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // my code
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var viewModel = ViewModelProvider(this,).get(MainActivityViewModel::class.java)
        //
        binding.count.text = viewModel.count.toString()
        // listener
        binding.btnCount.setOnClickListener{
            viewModel.increase()
            binding.count.text = viewModel.count.toString()
        }
    }
}