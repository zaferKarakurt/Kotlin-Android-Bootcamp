package com.zafer.kotlindersleri.gun04_kalitim_ve_koleksiyonlar.interface_kullanimi

class ClassA : MyInterface {
    // İnterface içindeki bütün özelliikleri eklemeliyiz.
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod 1 çalıştı.")
    }

    override fun metod2(): String {
        return "Metod 2 çalıştı."
    }

    /* Kalıtım ile farkları :
        Parantez olmadan aktarrılabilir.
        İçerisindeki özellikleri aktarmak zorundayız.
        Birden fazla interfaze bir class'a aktarılabilir.
     */
}