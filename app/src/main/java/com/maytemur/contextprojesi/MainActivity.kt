package com.maytemur.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toast,alert
        //applicationContext -- app context
        //this, this@MainActivity -- aktivitenin contexti

        Toast.makeText(this,"Hoşgeldiniz!",Toast.LENGTH_LONG).show()
    }
    fun mesajGoster (view: View){
        val uyariMesaji = AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("şifre hatası")
        uyariMesaji.setMessage("şifre girmediniz, baştan denemek istermisiniz ?")
        //lambda gösterimi

        uyariMesaji.setPositiveButton("evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"baştan deniyorsunuz",Toast.LENGTH_LONG).show()

        })

        uyariMesaji.setNegativeButton("hayır") {dialogInterface, i ->
            Toast.makeText(this,"Hayırı seçtiniz,deneyemiyorsunuz",Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()


    }
}