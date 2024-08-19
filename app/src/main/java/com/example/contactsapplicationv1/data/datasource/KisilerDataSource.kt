package com.example.contactsapplicationv1.data.datasource

import android.util.Log

class KisilerDataSource
{
//sayfaya veri aktarımı varsa o live data kullan
    suspend fun kaydet(kisi_Ad:String,kisi_Tel:String){
    Log.e("Kisi Kaydet","$kisi_Ad - $kisi_Tel")
    }
    suspend fun guncelle(kisi_Id:Int,kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Guncelle","$kisi_Id - $kisi_Ad - $kisi_Tel")
    }
    suspend fun sil(kisi_id:Int){
        Log.e("Kisi Sil",kisi_id.toString())
    }
}