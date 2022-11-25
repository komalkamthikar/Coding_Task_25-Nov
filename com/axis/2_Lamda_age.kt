package com.axis
import java.util.Scanner

fun main() {
    var sc= Scanner(System.`in`)
    print("Enter the age to check: ")
    var age=sc.nextInt()
    var lambda:(Int) -> String = {
        if (age<18) "Not an Adult"
        else if( age>=18 && age<=55) "You are an adult"
        else "Senior Citizen"}

    println("the person is ${lambda(age)}")

}