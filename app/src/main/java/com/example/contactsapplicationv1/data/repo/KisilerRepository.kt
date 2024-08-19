package com.example.contactsapplicationv1.data.repo

import android.util.Log
import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.ui.viewmodel.KisiKayitViewModel

class KisilerRepository {
    var kisilerdatasource=KisilerDataSource()
    suspend fun kaydet(kisi_Ad:String,kisi_Tel:String)= kisilerdatasource.kaydet(kisi_Ad,kisi_Tel)
    suspend fun guncelle(kisi_Id:Int,kisi_Ad:String,kisi_Tel:String)=kisilerdatasource.guncelle(kisi_Id,kisi_Ad,kisi_Tel)
    suspend fun sil(kisi_id:Int)=kisilerdatasource.sil(kisi_id)
}