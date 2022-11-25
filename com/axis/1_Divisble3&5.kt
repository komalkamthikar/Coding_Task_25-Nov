package com.axis

fun main() {
    println("The numbers divisible by 3 & 5 are : ")
    for(i in 1.. 100){
        if(i%3==0 && i%5==0){
            println("$i")
        }
    }
}