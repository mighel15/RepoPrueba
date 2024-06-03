package aceituno.rojo.photomath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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


        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        btnIngresar.setOnClickListener {
            if(etUsuario.text.toString().trim() == "admin" && etPassword.text.toString().trim() == "123456")
            {
                //ingreso al menu
                val intentNextActivity = Intent(this, MenuActivity::class.java)
                startActivity(intentNextActivity)
            }
            else{
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show()
            }


        }
        //tvMensaje = findViewById(R.id.tvMensaje)

        //tvMensaje.setOnClickListener {
        //    val intentNextActivity = Intent(this, WelcomeActivity  ::class.java)
        //    startActivity(intentNextActivity)
        //}


    }
}