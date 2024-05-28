package aceituno.rojo.photomath

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    //private lateinit var tvMensaje :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        //tvMensaje = findViewById(R.id.tvMensaje)

        //tvMensaje.setOnClickListener {
        //    val intentNextActivity = Intent(this, WelcomeActivity  ::class.java)
        //    startActivity(intentNextActivity)
        //}


    }
}