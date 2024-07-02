package aceituno.rojo.photomath.adapters

import aceituno.rojo.photomath.R
import aceituno.rojo.photomath.models.ContactoModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView


class ContactosAdapter:RecyclerView.Adapter<ContactosAdapter.ViewHolder>() {

    var lstContactos: List<ContactoModel> = emptyList()
    fun actualizarLista(lst: List<ContactoModel>){
        lstContactos = lst
        notifyDataSetChanged() //Adaptor: se tiene cambios en la lista general y debes repintar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_contactos, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lstContactos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setValues(lstContactos[position])
    }

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val nombres = view.findViewById<TextView>(R.id.tvNombre)
        val correo = view.findViewById<TextView>(R.id.tvCorreo)
        val celular = view.findViewById<TextView>(R.id.tvCelular)
        val estrella = view.findViewById<ImageView>(R.id.ivEstrella)
        fun setValues(model: ContactoModel){
            nombres.setText(model.nombre)
            correo.setText(model.correo)
            celular.setText(model.celular)
            estrella.isVisible = model.vip
        }
    }
}