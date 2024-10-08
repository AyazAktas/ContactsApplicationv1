package com.example.contactsapplicationv1.data.repo

import android.util.Log
import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.ui.viewmodel.KisiKayitViewModel

class KisilerRepository(var kds:KisilerDataSource){

    suspend fun kaydet(kisi_Ad:String,kisi_Tel:String)= kds.kaydet(kisi_Ad,kisi_Tel)
    suspend fun guncelle(kisi_Id:Int,kisi_Ad:String,kisi_Tel:String)=kds.guncelle(kisi_Id,kisi_Ad,kisi_Tel)
    suspend fun sil(kisi_id:Int)=kds.sil(kisi_id)
    suspend fun kisileriYukle():List<Kisiler> = kds.kisileriYukle()
    suspend fun ara(aramaKelimesi:String):List<Kisiler> = kds.ara(aramaKelimesi)
}