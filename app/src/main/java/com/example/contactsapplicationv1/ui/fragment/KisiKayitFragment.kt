package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {
    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_kayit,container, false)
        binding.kisiKayitFragment=this
        binding.kisiKayitToolbarBaslik="Kişi Kayıt Ekranı"

        return binding.root
    }

    fun buttonKaydet(kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Kaydet","$kisi_Ad - $kisi_Tel")
    }


}