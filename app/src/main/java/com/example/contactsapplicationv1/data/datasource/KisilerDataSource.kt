package com.example.contactsapplicationv1.data.datasource

import android.util.Log
import androidx.compose.ui.platform.isDebugInspectorInfoEnabled
import androidx.lifecycle.MutableLiveData
import com.example.contactsapplicationv1.data.entity.Kisiler
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.toObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(val collectionReference: CollectionReference)
{
//sayfaya veri aktarımı varsa o live data kulla
    var kisilerListesi=MutableLiveData<List<Kisiler>>()

    fun kisileriYukle():MutableLiveData<List<Kisiler>> {
        collectionReference.addSnapshotListener { value, error ->
            if(value!=null){
                val liste=ArrayList<Kisiler>()
                for(d in value.documents){
                    val kisi=d.toObject(Kisiler::class.java)
                    if (kisi!=null){
                        kisi.kisi_id=d.id
                        liste.add(kisi)
                    }
                }
                kisilerListesi.value=liste
            }
        }

        return kisilerListesi
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

    fun ara(aramaKelimesi:String):MutableLiveData<List<Kisiler>>{
       return MutableLiveData<List<Kisiler>>()
    }

}