package com.example.contactsapplicationv1.ui.adapter

import android.content.Context
import android.icu.text.Transliterator.Position
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.databinding.CardTasarimBinding
import com.example.contactsapplicationv1.databinding.FragmentAnasayfaBinding
import com.example.contactsapplicationv1.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext:Context,var kisilerListesi:List<Kisiler>):  //cardview_Xml tanıtma işlemi gibi düşün erişme işlemi
    RecyclerView.Adapter<KisilerAdapter.CardTasarimHolder>() {

    inner class CardTasarimHolder(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)//hpşder binding işlem yapılmasıın sağlar

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        val binding:CardTasarimBinding=DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_tasarim,parent,false )
        return CardTasarimHolder(binding) //bniding kurulumu
    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        //card ile alakalı işlemler bu fonk üzerinden yapılır.
        val kisi=kisilerListesi.get(position)
        val t = holder.tasarim
        // t card_tasarim.xml deki nesnelere erişmeni sağlar
        t.kisiNesnesi=kisi

        t.cardViewSatir.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.kisiDetayGecis(kisi=kisi)
            Navigation.findNavController(it).navigate(gecis)
        }
        t.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_Ad} silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){
                    sil(kisi.kisi_id)
                }
                .show()
        }

    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }

    fun sil(kisi_id:Int){
        Log.e("Kisi Sil",kisi_id.toString())
    }
}