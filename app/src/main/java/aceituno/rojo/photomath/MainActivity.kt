package aceituno.rojo.photomath

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        var numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2
        numero = 1 + 2

        //val tvNombre = findViewById(R.id.tvNombre) as TextView
        //tvNombre.setText("Hola Mundo")

    }
    fun ObtenerNombre():String
    {
        return "Miguel Aceituno Rojo"
    }


    /**
     * res: Recursos
     *      - drawable  ->  Imagenes (png, jpg, ... svg(vectorizado), ... ), xml
     *      - font      -> Fuentes (Tipografia de letras)
     *      - values    -> valores (preestablecidos, cadenas, valores, padding, margin)
     *      - xml       -> personalizado
     *      - layouts   -> aqui va sus diseños (pantalla de login, patalla de Registro de autos, ......
     *
     */

}