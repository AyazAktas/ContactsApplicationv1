package com.example.contactsapplicationv1.ui.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiDetayViewModel@Inject constructor(var krepo:KisilerRepository):ViewModel() {

    fun guncelle(kisi_Id:String,kisi_Ad:String,kisi_Tel:String){
        krepo.guncelle(kisi_Id,kisi_Ad,kisi_Tel)
    }
}