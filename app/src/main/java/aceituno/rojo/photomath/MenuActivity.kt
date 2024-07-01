package aceituno.rojo.photomath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnPersonas = findViewById<Button>(R.id.btnPersonas)
        btnPersonas.setOnClickListener {
            val intentNextActivity = Intent(this, SecondActivity::class.java)
            startActivity(intentNextActivity)
        }
    }
}