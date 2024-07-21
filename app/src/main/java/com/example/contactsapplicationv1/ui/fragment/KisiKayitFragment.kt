package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {
    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.toolbarKisiKayit.title="Kişi Kayıt Ekranı"
        binding.buttonKaydet.setOnClickListener {
            val kisi_Ad=binding.editTextKisiAd.text.toString()
            val kisi_Tel=binding.editTextKisiTel.text.toString()
            kaydet(kisi_Ad,kisi_Tel)
        }

        return binding.root
    }

    fun kaydet(kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Kaydet","$kisi_Ad - $kisi_Tel")
    }


}