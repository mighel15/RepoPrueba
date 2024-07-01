package aceituno.rojo.photomath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

         val btnIniciar = findViewById<Button>(R.id.btnIngresar)

        btnIniciar.setOnClickListener{
            //Toast.makeText(baseContext, "Me hicieron clic", Toast.LENGTH_SHORT).show()

            val intentNextActivity = Intent(this, LoginActivity::class.java)
            startActivity(intentNextActivity)
        }
    }
}