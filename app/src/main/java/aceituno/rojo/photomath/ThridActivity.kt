package aceituno.rojo.photomath

import aceituno.rojo.photomath.models.ContactoModel
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thrid)
        val amigo = ContactoModel("Miguel","99999999","Jr. Puno 123", "correo@correo.com",true)


        /*val amigos = MutableList <ContactoModel>
        amigos.add(amigo)
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))*/
    }
}