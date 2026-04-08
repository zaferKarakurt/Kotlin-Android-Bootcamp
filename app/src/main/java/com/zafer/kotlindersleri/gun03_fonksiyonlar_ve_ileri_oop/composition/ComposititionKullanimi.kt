package com.zafer.kotlindersleri.gun03_fonksiyonlar_ve_ileri_oop.composition

fun main() {
    val k1 = Katogoriler(1,"Dram")
    val k2 = Katogoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Nolan")
    val y2 = Yonetmenler(2,"Tarantino")

    val f1 = Filmler(1,"Django",2013,k1,y1)
}