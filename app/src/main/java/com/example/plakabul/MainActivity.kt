package com.example.plakabul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.plakabul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener{
            if (binding.editTextNumber.text.isNotEmpty()){
                val plakaKodu = binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    35 -> binding.textView.text = "izmir"
                    34 -> binding.textView.text = "istanbul"
                    61 -> binding.textView.text = "Trabzon"
                    3 -> binding.textView.text = "Afyon"
                    9 -> binding.textView.text = "Aydin"

                    else -> {
                        binding.textView.text = "Bulunamadı!"
                    }
                }
            }
            else{
                binding.textView.text = "Şehir plaka kodu giriniz."
            }

            binding.editTextNumber.text.clear()
        }


    }



}