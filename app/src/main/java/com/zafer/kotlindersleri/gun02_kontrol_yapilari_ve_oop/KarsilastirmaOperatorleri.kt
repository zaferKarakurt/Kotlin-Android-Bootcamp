package com.zafer.kotlindersleri.gun02_kontrol_yapilari_ve_oop

fun main() {
    val a = 90
    val b = 45

    val x = 80
    val y = 20

    println("a == b :  ${a==b}")
    println("a != b :  ${a!=b}")
    println("a < b  :  ${a<b}")
    println("a <= b :  ${a<=b}")
    println("a > b  :  ${a>b}")
    println("a >= b :  ${a>=b}")

    println("a > b  || x > y: ${a > b  || x > y}" ) // OR
    println("a > b  && x > y: ${a > b  && x > y}" ) // AND
}