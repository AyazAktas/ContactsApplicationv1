package com.example.contactsapplicationv1.data.datasource

import android.util.Log
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.example.contactsapplicationv1.room.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kdao:KisilerDao )
{
//sayfaya veri aktarımı varsa o live data kullan !

    suspend fun kisileriYukle():List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kdao.kisileriYukle()
        }

    suspend fun kaydet(kisi_Ad:String,kisi_Tel:String){
        val yeniKisi=Kisiler(0,kisi_Ad,kisi_Tel)
        kdao.kaydet(yeniKisi)
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