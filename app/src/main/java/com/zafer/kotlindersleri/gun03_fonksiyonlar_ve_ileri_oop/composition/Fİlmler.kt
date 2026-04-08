package com.zafer.kotlindersleri.gun03_fonksiyonlar_ve_ileri_oop.composition

data class Filmler(var film_id : Int,
                   var film_ad: String,
                   var film_yil: Int,
                   var katogoriler: Katogoriler ,
                   var yonetmenler: Yonetmenler) {
}