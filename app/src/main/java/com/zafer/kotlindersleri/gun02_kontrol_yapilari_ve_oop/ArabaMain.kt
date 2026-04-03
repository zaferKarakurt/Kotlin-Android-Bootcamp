package com.zafer.kotlindersleri.gun02_kontrol_yapilari_ve_oop

fun main() {
    //Nesne Oluşturma

    val bmw = Araba("Kırmızı",100,true)

    val sahin = Araba("Beyaz",50,false)

    // Okuma
    bmw.bilgiAl()
    sahin.bilgiAl()

//    println("------------------------")
//    println("Renk : ${bmw.renk}")
//    println("Renk : ${bmw.hiz}")
//    println("Renk : ${bmw.calisiyoMu}")


    // Veri Atamma
    bmw.renk = "Mavi"
    bmw.hiz = 200
    bmw.calisiyoMu = false

//    println("------------------------")
//    println("Renk : ${bmw.renk}")
//    println("Renk : ${bmw.hiz}")
//    println("Renk : ${bmw.calisiyoMu}")

    bmw.bilgiAl()  //Tek tek yazmak yerine class'a bir fonskiyon ekleyip ekrana yazsırma işlemi yapıyoruz
    sahin.bilgiAl()

}