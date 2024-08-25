package com.example.contactsapplicationv1.data.repo

import android.util.Log
import com.example.contactsapplicationv1.data.datasource.KisilerDataSource
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.ui.viewmodel.KisiKayitViewModel

class KisilerRepository(var kds:KisilerDataSource){

    fun kaydet(kisi_Ad:String,kisi_Tel:String)= kds.kaydet(kisi_Ad,kisi_Tel)
    fun guncelle(kisi_Id:String,kisi_Ad:String,kisi_Tel:String)=kds.guncelle(kisi_Id,kisi_Ad,kisi_Tel)
    fun sil(kisi_id:String)=kds.sil(kisi_id)
    fun kisileriYukle():List<Kisiler> = kds.kisileriYukle()
    fun ara(aramaKelimesi:String):List<Kisiler> = kds.ara(aramaKelimesi)
}