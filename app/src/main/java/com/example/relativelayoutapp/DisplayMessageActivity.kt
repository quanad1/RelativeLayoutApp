package com.example.relativelayoutapp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import org.w3c.dom.Text

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val messages = message!!.split(" ").toTypedArray()
        val textView4 = findViewById<TextView>(R.id.textView4).apply {
            text = messages[0]

        }
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = messages[1]

        }
    }
}