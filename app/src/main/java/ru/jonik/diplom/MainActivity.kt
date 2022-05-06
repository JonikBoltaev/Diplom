package ru.jonik.diplom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.jonik.diplom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //..
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}