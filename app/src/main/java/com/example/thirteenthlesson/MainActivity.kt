package com.example.thirteenthlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        supportFragmentManager.beginTransaction()
            .add(R.id.frafmentContainer, FirstFragment())//add выкладывает один экран на другой.
            .commit()
    }
}
