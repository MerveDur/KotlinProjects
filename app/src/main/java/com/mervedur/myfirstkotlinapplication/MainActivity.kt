package com.mervedur.myfirstkotlinapplication

import com.mervedur.myfirstkotlinapplication.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.isimText
import kotlinx.android.synthetic.main.activity_main.meslekText
import kotlinx.android.synthetic.main.activity_main.sonucText
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_main.yasText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(5*10)
        cıkarma(88,42)
        sinifCalismasi()

    }

    /*  fun degistir(view:View)
    {
        textView.text="Merhaba Android Projem"


    }*/

    fun cıkarma(x:Int,y:Int): Int
    {
        textView.text="Sonuç: ${x-y}"
        println(x-y)
        return  x-y
    }
    fun degistir(view:View)
    {
        val sonuc=cıkarma(45,27)
        textView.text="Sonuç: ${sonuc}"
    }

    fun sinifCalismasi()
    {
        var superKahraman=SuperKahraman("Merve",26,"Pc Eng.")


        textView.text="${superKahraman.isim} : ${superKahraman.meslek} "
    }

    fun kahramanOlustur(view:View)
    {
        var isim=isimText.text.toString()
        var meslek=meslekText.text.toString()
        var yas=yasText.text.toString().toIntOrNull()

        if(yas==null)
        {
            sonucText.text="Doğru yaşı giriniz!"
        }
        else
        {
            var superKahraman = SuperKahraman(isim, yas, meslek)

            sonucText.text = "İsim: ${isim}  Meslek: ${meslek} Yaş: ${yas}"
        }
    }
}