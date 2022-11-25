package com.axis.app

import com.axis.module.Wrestler
import com.axis.service.WrestlerService
import java.util.*
fun main(){
    var scan = Scanner(System.`in`)
    var wrestlerService=WrestlerService()


    println("================MENU====================")
    println("1.Add Wrestler \n2.Display All Wrestlers\n3.count of wrestlers whose age is > 35\n4.Exit")

    println("enter choice")
    var option=scan.nextInt()
    while (option <5) {
        when (option) {
            1->{
                println("enter wrestler name")
                var name=scan.next()
                println("enter wrestler age")
                var age =scan.nextInt()
                println("enter wrestler height")
                var height=scan.nextInt()
                println("enter wrestler weight")
                var weight=scan.nextInt()

                //passing values to object
                var wrestler=Wrestler(name,age,height,weight)

                //adding to mutable list
                wrestlerService.addWrestler(wrestler)

            }

            2->{
                wrestlerService.displayAllWrestlers()
            }
            3->{
                wrestlerService.countOfWrestlers()
            }
            4->{
                println("Program end")
                System.exit(0)
            }


        }
        println("------------Process completed-------------")
        println("1.Add Wrestler \n2.Display All Wrestlers\n3.count of wrestlers whose age is > 35\n4.Exit")

        println("Enter option to continue")
        var Option =scan.nextInt()
        option = Option
    }

}