package com.zafer.kotlindersleri.gun03_fonksiyonlar_ve_ileri_oop

fun main() {

    ucretHesap(5, KonserveBoyut.ORTA)

}

fun ucretHesap(adet: Int,boyut: KonserveBoyut){

    when(boyut){
        KonserveBoyut.KUCUK -> println("Maliyet : ${adet * 30}")
        KonserveBoyut.ORTA -> println("Maliyet : ${adet * 40}")
        KonserveBoyut.BUYUK -> println("Maliyet : ${adet * 50}")
    }

}