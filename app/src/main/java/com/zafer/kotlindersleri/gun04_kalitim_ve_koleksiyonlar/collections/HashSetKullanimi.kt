package com.zafer.kotlindersleri.gun04_kalitim_ve_koleksiyonlar.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler) // İçeriği karıştırılmış olarak tutulur.

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())


    for (m in meyveler){
        println(m)
    }

    for ((i,m) in meyveler.withIndex()){
        println("$i. -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}