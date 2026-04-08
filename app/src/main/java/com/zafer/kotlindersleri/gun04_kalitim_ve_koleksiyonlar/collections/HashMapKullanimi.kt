package com.zafer.kotlindersleri.gun04_kalitim_ve_koleksiyonlar.collections

fun main() {

    var iller = HashMap<Int, String>()

    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller[6] = "Ankara"

    println(iller)

    print(iller.get(16))

    //Güncellme
    iller.put(16,"Yeni Bursa")
    println(iller)


    print(iller.size)
    print(iller.isEmpty())


    for ((anahtar,deger) in iller){
        print("${anahtar} -> ${deger}")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)

}