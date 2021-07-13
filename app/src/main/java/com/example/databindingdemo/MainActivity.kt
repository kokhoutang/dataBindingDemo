package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FillEventHistory
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var aPerson : Person = Person("ali", "123456789", "ali@gmail.com", "jalan123")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener() {

            aPerson.email = "lala@gmail.com"
            aPerson.address = "jalanABC"

            
            binding.tvName.text = aPerson.name
            binding.tvIC.text = aPerson.ic
            binding.tvEmail.text = aPerson.email
            binding.tvAddress.text = aPerson.address
        }

/*
        val tvName :TextView findViewById(R.id.tvName)
        val tvNRIC :TextView findViewById(R.id.tvName)
        val tvName :TextView findViewById(R.id.tvName)
        val tvName :TextView findViewById(R.id.tvName)

 */

    }
}