package org.opreker.belajarlibrary

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import org.opreker.snacky.Snacky


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootView: View = findViewById(R.id.rootView)

        val button = findViewById<Button>(R.id.btn_snackbar)

        button.setOnClickListener {
            Snacky.showSnackbar(rootView, "This is a test message!!")
        }
    }
}