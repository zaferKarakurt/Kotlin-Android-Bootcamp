package com.zafer.kotlindersleri.gun02_kontrol_yapilari_ve_oop

class Araba (var renk: String,var hiz: Int,var calisiyoMu: Boolean) {

    init { // class'tan her nesne oluşturulduğunda bu kısım çalışır.
        println("******Constructor çalıştı.******")
    }

    fun bilgiAl(){
        println("------------------------")
        println("Renk : ${renk}")
        println("Renk : ${hiz}")
        println("Renk : ${calisiyoMu}")
    }

    // Örnek Fonksiyonlar

    fun calistir(){
        calisiyoMu = true
        hiz = 200
    }

    fun durdur(){
        calisiyoMu = false
        hiz = 0
    }
}