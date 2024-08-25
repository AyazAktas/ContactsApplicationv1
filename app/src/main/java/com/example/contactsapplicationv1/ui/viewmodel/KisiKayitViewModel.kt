package com.example.contactsapplicationv1.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.contactsapplicationv1.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiKayitViewModel@Inject constructor(var krepo:KisilerRepository):ViewModel() {

   fun kaydet(kisi_Ad:String,kisi_Tel:String) {
       krepo.kaydet(kisi_Ad, kisi_Tel)
   }
}