package com.zafer.kotlindersleri.gun01_giris

fun main() {
    println("Merhaba Dünya!")

    var ogrenciAdi = "Zafer"
    var ogrenciYas = 22
    var ogrenciBoy = 1.70
    var ogrenciNot = 'A'
    var ogrenciAktifMi = true

    var urun_adi : String = "Iphone 11"
    var urun_fiyat : Double = 20.000
    var urun_id : Int = 1340

    println("Ürün Adı : $urun_adi")

    var a = 5
    var b = 10

    println("$a x $b = ${a*b}") //String insert

    //Sabitler - Constant
    val sayi = 30 // İlerleyen işlemlerde sayi değişkenenin içeriği değiştirilemez.

    //Tür Dönüşümü
    val c = 43
    val d = 29.32
    val e = "67"

    val sonuc1 = c.toDouble()
    val sonuc2 = d.toInt()
    val sonuc3 = d.toString()

    val sonuc4 = e.toDoubleOrNull() // Örneğin 67t yazılırsa uygulama çökmemesin diye bu durumda Null dönmesini sağlıyoruz.

    println(sonuc1)
    println(sonuc3)

    //Olası çökmeleri engellemek için kontrol:

    if(sonuc4 != null){
        println(sonuc4)
    }else{
        println("Sayınızı kontrol ediniz!!")
    }

    // ya da :

    sonuc4?.let {
        println(sonuc4) // ya da (it) . Yukarıdaki if bloğunun yerine kullanılabilir.
    }

}