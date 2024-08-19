package com.example.contactsapplicationv1.data.datasource

import android.util.Log
import com.example.contactsapplicationv1.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource
{
//sayfaya veri aktarımı varsa o live data kulla

    suspend fun kisileriYukle():List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi=ArrayList<Kisiler>()
            val k1=Kisiler(71,"ayaz","5645645")
            val k2=Kisiler(12,"yaz","56455")
            val k3=Kisiler(7,"az","565645")
            kisilerListesi.add(k1)
            kisilerListesi.add(k2)
            kisilerListesi.add(k3)
            return@withContext kisilerListesi
        }

    suspend fun kaydet(kisi_Ad:String,kisi_Tel:String){
    Log.e("Kisi Kaydet","$kisi_Ad - $kisi_Tel")
    }
    suspend fun guncelle(kisi_Id:Int,kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Guncelle","$kisi_Id - $kisi_Ad - $kisi_Tel")
    }
    suspend fun sil(kisi_id:Int){
        Log.e("Kisi Sil",kisi_id.toString())
    }


    suspend fun ara(aramaKelimesi:String):List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi=ArrayList<Kisiler>()
            val k1=Kisiler(71,"ayaz","5645645")
            kisilerListesi.add(k1)
            return@withContext kisilerListesi
        }
}