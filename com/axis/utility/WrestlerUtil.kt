package com.axis.utility

import com.axis.module.Wrestler

class WrestlerUtil {
    var wrestlerList = mutableListOf<Wrestler>()

    init {
        wrestlerList.add(Wrestler("Ankit", 25, 60, 90))
        wrestlerList.add(Wrestler("Anmol", 32, 68, 100))
        wrestlerList.add(Wrestler("Anil", 23, 56, 78))
        wrestlerList.add(Wrestler("Gopal", 53, 54, 120))
        wrestlerList.add(Wrestler("Manish", 65, 70, 100))
    }

    fun addWrest(wrestler: Wrestler) {
        wrestlerList.add(wrestler)
        println("Wrestler added to list successfully!!!!")
    }

    fun display() {
        for (wrestler in wrestlerList) {
            println(wrestler.toString())

        }
    }

    fun count() {
        var countList = wrestlerList.count { it.age > 35 }
        println("Count of wrestlers whose age is > 35 : $countList")
    }
}