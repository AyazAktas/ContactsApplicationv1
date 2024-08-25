package com.example.contactsapplicationv1.data.datasource

import android.util.Log
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.google.firebase.firestore.CollectionReference
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(val collectionReference: CollectionReference)
{
//sayfaya veri aktarımı varsa o live data kulla

    fun kisileriYukle():List<Kisiler> {
        return listOf()
    }
    fun kaydet(kisi_Ad:String,kisi_Tel:String){
        val yeniKisi=Kisiler("",kisi_Ad,kisi_Tel)
        collectionReference.document().set(yeniKisi)
    }
    fun guncelle(kisi_Id:String,kisi_Ad:String,kisi_Tel:String){
        Log.e("Kisi Guncelle","$kisi_Id - $kisi_Ad - $kisi_Tel")
    }
    fun sil(kisi_id:String){
        Log.e("Kisi Sil",kisi_id.toString())
    }

    fun ara(aramaKelimesi:String):List<Kisiler>{
       return listOf()
    }

}