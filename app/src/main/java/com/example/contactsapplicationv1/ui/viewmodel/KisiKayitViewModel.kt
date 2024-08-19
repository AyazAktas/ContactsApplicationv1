package com.example.contactsapplicationv1.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.contactsapplicationv1.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiKayitViewModel:ViewModel() {
    var krepo= KisilerRepository()
   fun kaydet(kisi_Ad:String,kisi_Tel:String){
       CoroutineScope(Dispatchers.Main).launch {
           krepo.kaydet(kisi_Ad,kisi_Tel)
       }


   }
}