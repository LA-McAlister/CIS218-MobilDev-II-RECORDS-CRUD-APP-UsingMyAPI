package com.msla_mac.recordscrudlamapi

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

var recordsList = ArrayList<RecordsItem>()
var currentRecord = 0
const val baseUrl = "https://testapi.mslamac.com/api/products"

open class BaseActivity() : AppCompatActivity() {

    open fun toastIt(msg: String?) {
        Toast.makeText(
            applicationContext,
            msg, Toast.LENGTH_SHORT
        ).show()
    }
}