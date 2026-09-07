package com.hamoudi.azalai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "مرحباً حمودي! تطبيق Azal AI يعمل بنجاح "
            textSize = 24f
            setPadding(50, 50, 50, 50)
        }
        setContentView(textView)
    }
}
