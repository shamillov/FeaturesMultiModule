package com.shamilov.multimoduleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shamilov.multimoduleexample.ui.MainFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(R.id.container, MainFragment.newInstance())
            .commit()
    }
}