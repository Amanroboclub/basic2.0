package com.rajaman.basic20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val email = editText.text.toString()
            val pass = editText2.text.toString()

            if (login(email, pass)) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                editText.text.clear()
                editText2.text.clear()
            }else{
                Toast.makeText(this, "Wrong email/password!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun login(email :String, pass :String): Boolean {

        val actualEmail = "sam@gmail.com"
        val actualPass = "123good"
        return email == actualEmail && pass == actualPass

    }
}
