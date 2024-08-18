package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_kisi_detay, container, false)
        binding.kisiDetayFragment=this
        binding.kisiDetayToolbarBaslik="Kişi Detay Güncelleme Sayfası"

        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi=bundle.kisi
        binding.kisiNesnesi=gelenKisi
        binding.editTextKisiAdGuncelle.setText(gelenKisi.kisi_Ad)
        binding.editTextKisiTelGuncelle.setText(gelenKisi.kisi_Tel)

        return binding.root
    }
    fun buttonGuncelle(kisi_Id:Int,kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Guncelle","$kisi_Id - $kisi_Ad - $kisi_Tel")
    }
}