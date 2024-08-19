package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.databinding.FragmentAnasayfaBinding
import com.example.contactsapplicationv1.ui.adapter.KisilerAdapter
import com.example.contactsapplicationv1.ui.viewmodel.AnasayfaViewModel
import com.example.contactsapplicationv1.ui.viewmodel.KisiKayitViewModel

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa ,container, false)
        binding.anasayfaFragment=this
        binding.anasayfaToolbarBaslik="Kişilerim"

        binding.rv.layoutManager=LinearLayoutManager(requireContext())//alt alta gözükmesini saplar

        val kisilerListesi=ArrayList<Kisiler>()
        val k1=Kisiler(71,"ayaz","5645645")
        val k2=Kisiler(12,"yaz","56455")
        val k3=Kisiler(7,"az","565645")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter=KisilerAdapter(requireContext(),kisilerListesi,viewModel)
        binding.kisilerAdapter=kisilerAdapter


        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }
        })

        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel=tempViewModel
    }


    fun fabTikla(it:View){
        Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
    }

    fun ara(aramaKelimesi:String){
        Log.e("Kisi Ara",aramaKelimesi)
    }

}