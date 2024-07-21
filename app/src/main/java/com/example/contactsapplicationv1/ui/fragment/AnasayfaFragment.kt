package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.floatingActionButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

        binding.buttonDetayGor.setOnClickListener {
            val kisi=Kisiler(1,"ayaz","552442245")
            val gecis=AnasayfaFragmentDirections.kisiDetayGecis(kisi=kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}