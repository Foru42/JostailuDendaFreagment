package com.example.jostailudendafreagment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jostailudendafreagment.databinding.ActivityMainBinding
import com.example.jostailudendafreagment.fragments.HomeFragment
import com.example.jostailudendafreagment.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.frameContainer, HomeFragment()).commit()

        binding.bottomNavMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.hasi -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer,HomeFragment()).commit()
                R.id.profil -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer,ProfileFragment()).commit()
                R.id.exit -> finish()

            }
            true

        }
    }
}