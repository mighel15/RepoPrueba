package aceituno.rojo.photomath

import aceituno.rojo.photomath.adapters.ContactosAdapter
import aceituno.rojo.photomath.models.ContactoModel
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thrid)

        val amigos: MutableList <ContactoModel> = mutableListOf()
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",true))
        amigos.add(ContactoModel("Marco", "1234567","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Pedro", "15665464","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("María", "13121321","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Esteban", "15123131","Jr Juliaca 123", "mail@correo.com",true))
        amigos.add(ContactoModel("Karla", "1231231","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Diana", "15314444","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Jesus", "4444444","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Marco", "1234567","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Pedro", "15665464","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("María", "13121321","Jr Juliaca 123", "mail@correo.com",true))
        amigos.add(ContactoModel("Esteban", "15123131","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Karla", "1231231","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Diana", "15314444","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Jesus", "4444444","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Juan", "888888","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Marco", "1234567","Jr Juliaca 123", "mail@correo.com",true))
        amigos.add(ContactoModel("Pedro", "15665464","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("María", "13121321","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Esteban", "15123131","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Karla", "1231231","Jr Juliaca 123", "mail@correo.com",true))
        amigos.add(ContactoModel("Diana", "15314444","Jr Juliaca 123", "mail@correo.com",false))
        amigos.add(ContactoModel("Jesus", "4444444","Jr Juliaca 123", "mail@correo.com",false))

        val adaptor: ContactosAdapter = ContactosAdapter()
        adaptor.actualizarLista(amigos)

        val rvContactos = findViewById<RecyclerView>(R.id.rvContactos)
        rvContactos.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = adaptor
        }
    }
}