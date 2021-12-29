package com.example.sewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    var txtuser: EditText? = null
    var txtpass: EditText? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        txtuser = findViewById<View>(R.id.user) as EditText
        txtpass = findViewById<View>(R.id.pass) as EditText
        val loginbtn = findViewById<View>(R.id.buttonlogin) as Button
        loginbtn.setOnClickListener {
            if (txtuser!!.text.toString() == "kelompokG" && txtpass!!.text.toString() == "123") {
                Toast.makeText(applicationContext, "LOGIN BERHASIL", Toast.LENGTH_LONG).show()
                val Login = Intent(applicationContext, BerandaActivity::class.java)
                startActivity(Login)
            } else Toast.makeText(
                this@HomeActivity,
                "User atau Password Salah",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}