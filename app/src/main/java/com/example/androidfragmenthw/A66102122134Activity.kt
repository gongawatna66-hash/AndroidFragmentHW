package com.example.androidfragmenthw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class A66102122134Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_66102122134)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment134())
                .commit()
        }
    }
}
