package com.zafer.kotlindersleri.gun04_kalitim_ve_koleksiyonlar.collections

fun main() {

    val o1 = Ogrenciler(100,"Zafer","12-A")
    val o2 = Ogrenciler(400,"Zeynep","12-A")
    val o3 = Ogrenciler(300,"Ali","11-A")

    val ogrencilerListesi = ArrayList<Ogrenciler>()

    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi){
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }


    // SORT - SIRALAMA
    println("Sayısal : Küçükten Büyüğe")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy { it.no}) // ASC

    for (o in siralama1){
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Sayısal : Büyükten Küçüğe")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending { it.no}) //DESC

    for (o in siralama2){
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    // Metinsel sıralama için it.no yerine it.ad kullanılır. Mantık aynıdır.


    // FİLTRELEME
    println("Filtreleme 1")
    val filtreleme1 = ogrencilerListesi.filter { it.no > 150}

    for (o in filtreleme1){
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Filtreleme 2 İçerik sorgulama ")
    val filtreleme2 = ogrencilerListesi.filter { it.ad.contains("y")}

    for (o in filtreleme2){
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }
}