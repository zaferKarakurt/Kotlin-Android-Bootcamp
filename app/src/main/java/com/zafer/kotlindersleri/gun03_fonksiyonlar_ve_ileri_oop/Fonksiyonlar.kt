package com.zafer.kotlindersleri.gun03_fonksiyonlar_ve_ileri_oop

class Fonksiyonlar{
    //void - Geri dönüş değeri olmayan
    fun selamla(){
        val mesaj = "Merhaba Zafer"
        println(mesaj)
    }

    //return - Geri dönüş değeri olan
    fun selamla2() : String {
        val mesaj = "Merhaba Zafer"
        return mesaj
    }

    //parametre
    fun selamla3(mesaj: String){
        var gidenMesaj = "Merhaba $mesaj"
        println(gidenMesaj)
    }


    fun topla(sayi1 : Int,sayi2: Int): Int{
        val toplam = sayi1 + sayi2
        return toplam
    }

    //Overloading
    //Farklı türlerde ve ya sayıda parametre ile aynı isime sahip fonksiyonlar oluşturulabilir.
    fun carp(sayi1 : Int,sayi2: Int): Int{
        val toplam = sayi1 * sayi2
        return toplam
    }

    fun carp(sayi1 : Double,sayi2: Double): Double{
        val toplam = sayi1 * sayi2
        return toplam
    }

    fun carp(sayi1 : Double,sayi2: Int,sayi3: Int): Double{
        val toplam = sayi1 * sayi2
        return toplam
    }
}