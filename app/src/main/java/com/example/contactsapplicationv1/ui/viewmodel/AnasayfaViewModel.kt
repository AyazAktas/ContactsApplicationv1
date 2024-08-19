package com.example.contactsapplicationv1.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel:ViewModel() {
    var krepo=KisilerRepository()
    var kisilerListesi=MutableLiveData<List<Kisiler>>()

    init{
        kisileriYukle()
    }

    fun sil(kisi_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.sil(kisi_id)
        }
    }
    fun kisileriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value=krepo.kisileriYukle()
        }
    }

  fun ara(aramaKelimesi:String){
      CoroutineScope(Dispatchers.Main).launch {
          kisilerListesi.value=krepo.ara(aramaKelimesi)
      }
  }
}