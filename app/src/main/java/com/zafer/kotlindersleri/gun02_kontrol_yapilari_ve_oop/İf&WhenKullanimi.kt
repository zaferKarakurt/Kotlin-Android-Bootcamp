package com.zafer.kotlindersleri.gun02_kontrol_yapilari_ve_oop

fun main() {
    val yas = 29
    val isim = "Zafer"

    if (yas > 19){
        println("Bu bir yetişkin.")
    }else{
        println("Bu bir çocuk.")
    }

    if (isim == "Zafer"){
        println("Bu Zafer.")
    }else if(isim == "Ahmet"){
        println("Bu Ahmet.")
    } else{
        println("Hatalı isim")
    }

    // And Kullanımı (True-True) / ( Or kullanımı birebir aynı (True or False))

    val kAdi = "abc"
    val ps = "123"

    if (kAdi == "abc" && ps =="123"){
        println("Giriş bilgileri doğru.")
    }else{
        println("Giriş bilgileri hatalı.")
    }

    // When Kullanımı

    val gun = 2

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        else -> println("Hata")
    }

}