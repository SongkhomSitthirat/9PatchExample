package com.example.customviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutRadius: ConstraintLayout = findViewById(R.id.layoutRadius)
        layoutRadius.clipToOutline = true

        val layoutRadiusInner: FrameLayout = findViewById(R.id.layoutRadiusInner)
        layoutRadiusInner.clipToOutline = true
    }
}