package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentKisiDetayBinding.inflate(inflater, container, false)

        binding.toolbarKisiDetay.title="Kişi Detay Güncelleme Sayfası"

        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi=bundle.kisi

        binding.editTextKisiAdGuncelle.setText(gelenKisi.kisi_Ad)
        binding.editTextKisiTelGuncelle.setText(gelenKisi.kisi_Tel)
        binding.buttonGuncelle.setOnClickListener {
            val kisi_Ad=binding.editTextKisiAdGuncelle.text.toString()
            val kisi_Tel=binding.editTextKisiTelGuncelle.text.toString()
            guncelle(gelenKisi.kisi_id,kisi_Ad,kisi_Tel)
        }

        return binding.root
    }
    fun guncelle(kisi_Id:Int,kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Guncelle","$kisi_Id - $kisi_Ad - $kisi_Tel")
    }
}