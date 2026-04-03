package com.zafer.kotlindersleri.gun02_kontrol_yapilari_ve_oop

fun main() {

    // 1,2,3
    for (i in 1..3){
        println(i)
    }

    //Birden ona kadar 2 er 2 er art
    for (i in 1..10 step 2){
        println(i)
    }

    //Birden ona kadar 2 er 2 er azal
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    //While - 1den 5e kadar sayıların yazımı
    var sayac = 1
    while (sayac < 5){
        println(sayac)
        sayac++
    }

    // Continue  ( i  2 ye eşit ise o adımı atla)
    for (i in 1..3){
        if (i == 2) {
            continue
        }
        println(i)
    }

    // Break  ( i  2 ye eşit ise döngüden çık)
    for (i in 1..3){
        if (i == 2) {
            break
        }
        println(i)
    }
}