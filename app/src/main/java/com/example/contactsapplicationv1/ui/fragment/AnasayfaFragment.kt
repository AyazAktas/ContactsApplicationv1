package com.example.contactsapplicationv1.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapplicationv1.R
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.databinding.FragmentAnasayfaBinding
import com.example.contactsapplicationv1.ui.adapter.KisilerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title="Kişilerim"

        binding.rv.layoutManager=LinearLayoutManager(requireContext())//alt alta gözükmesini saplar

        val kisilerListesi=ArrayList<Kisiler>()
        val k1=Kisiler(71,"ayaz","5645645")
        val k2=Kisiler(12,"yaz","56455")
        val k3=Kisiler(7,"az","565645")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter=KisilerAdapter(requireContext(),kisilerListesi)
        binding.rv.adapter=kisilerAdapter

        binding.floatingActionButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

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

    fun ara(aramaKelimesi:String){
        Log.e("Kisi Ara",aramaKelimesi)
    }

}