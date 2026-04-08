package com.zafer.kotlindersleri.gun04_kalitim_ve_koleksiyonlar.collections

fun main() {
    val sayilar = ArrayList <Int>()
    val meyveler = ArrayList <String>()

    //Veri Ekleme
    meyveler.add("Elma")//0.
    meyveler.add("Muz")//1.
    meyveler.add("Kiraz")//2.
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    // İnsert
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma İşlemi
    println(meyveler.get(2))

    // Sorgulamalar
    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Muz")}")

    meyveler.reverse() // Terse çevirir
    println(meyveler)


    meyveler.sort() // Sıralama yapar
    println(meyveler)

    // İndex numaraları ile beraber her itemi ekrana yazar
    for((index,meyve) in meyveler.withIndex()){
        println("Sonuç : $index. -> $meyve")
    }

    meyveler.removeAt(2) // 2. indexi siler
    println(meyveler)

    meyveler.clear() // ArrayList'in içini  siler
    println(meyveler)
}