package com.example.schoolclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.schoolclass.databinding.ActivityMain2Binding
import com.example.schoolclass.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding2= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)

        binding2.button3.setOnClickListener{
            finish()
        }
        binding2.button4.setOnClickListener{
            finish()
        }
    }
}