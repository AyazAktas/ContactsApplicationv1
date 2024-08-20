package com.example.contactsapplicationv1.utils

import android.view.View
import androidx.navigation.Navigation

fun Navigation.gecisYap(it:View,id:Int) {
    findNavController(it).navigate(id)
}