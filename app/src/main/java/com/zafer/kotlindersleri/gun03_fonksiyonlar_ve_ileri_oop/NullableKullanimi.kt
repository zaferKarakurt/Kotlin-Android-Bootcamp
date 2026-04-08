package com.zafer.kotlindersleri.gun03_fonksiyonlar_ve_ileri_oop

fun main() {
    // Nullable - Null safety
    var x = "Merhaba"


    // Tanımlama
    var str: String? = null
    str = "Merhabaa"

    // Yöntem 1
    println("Yöntem 1 : ${str?.trim()}")

    // Yöntem 2
    println("Yöntem 2 : ${str!!.trim()}")

    // Yöntem 3
    if (str != null){
        println("Yöntem 3 : ${str.trim()}")
    }else{
        println("Sonuç null !")
    }

    // Yöntem 4
    str?.let {
        println("Yöntem 4 : ${str.trim()}") // str yerine it kullanılabilir
    }

}