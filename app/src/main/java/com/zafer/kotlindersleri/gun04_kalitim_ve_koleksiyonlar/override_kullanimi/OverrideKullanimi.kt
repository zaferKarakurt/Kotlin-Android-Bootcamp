package com.zafer.kotlindersleri.gun04_kalitim_ve_koleksiyonlar.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()   // Kalıtım yok  kendi sınıfına erişti
    memeli.sesCikar()   // Kalıtım var üst sınııfın fonksiyonuna erişti
    kedi.sesCikar()     // Kalıtım var kendi sınıfını kullandı
    kopek.sesCikar()    // Kalıtım var kendi sınıfını kullandı
}