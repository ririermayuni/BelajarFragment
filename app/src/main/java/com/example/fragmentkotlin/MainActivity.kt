package com.example.fragmentkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frane_fragment, firstFragment)
            commit()
        }
        val btnFirstFragment = findViewById<Button>(R.id.btnFirstFragment)

        btnFirstFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frane_fragment, firstFragment)
                commit()
            }
        }

        val btnSecondFragment = findViewById<Button>(R.id.btnSecondfragment)

        btnSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frane_fragment, secondFragment)
                commit()
            }
        }
    }
}