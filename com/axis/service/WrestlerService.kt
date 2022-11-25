package com.axis.service

import com.axis.module.Wrestler
import com.axis.utility.WrestlerUtil
class WrestlerService {
    var wrestlerUtil=WrestlerUtil()
    fun addWrestler(wrestler: Wrestler){
        wrestlerUtil.addWrest(wrestler)

    }
    fun displayAllWrestlers(){
        wrestlerUtil.display()

    }
    fun countOfWrestlers(){
        wrestlerUtil.count()
    }
}