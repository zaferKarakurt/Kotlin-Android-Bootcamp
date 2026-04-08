package com.zafer.kotlindersleri.gun03_fonksiyonlar_ve_ileri_oop

fun main() {

    val f = Fonksiyonlar()
    f.selamla() // Fonksiyon kullanılırken açıklama kısmında Unit yazar


    val gelenSonuc = f.selamla2() // Fonksiyon kullanılırken açıklama kısmında String yazar
    println(gelenSonuc) // return ile gelen sonuç değişkene atanabildi.


    f.selamla3("Zafer")


    val toplamaSonuc = f.topla(3,5)
    println(toplamaSonuc)
}