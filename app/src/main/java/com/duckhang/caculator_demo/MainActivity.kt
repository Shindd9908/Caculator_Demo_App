package com.duckhang.caculator_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = Calculators()
        supportFragmentManager.beginTransaction()
                   .add(R.id.fragment_caculator, fragment)
                   .commit()

    }



}

