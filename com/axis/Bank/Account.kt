package com.axis.Bank

import java.util.Scanner
class AccountClass (accNo:Int,balance:Int,accountType:String){
    val accountNo:Int = accNo
    var account_balance:Int = balance
    var accountType:String = accountType
    var scan= Scanner(System.`in`)
    fun withdraw(){

        print("Enter the amount to withdraw: ")
        var amountadd:Int=scan.nextInt()
        var newbalance = account_balance - amountadd
        println("Balance after withdrawal: $newbalance ")
    }

    fun deposit(){

        print("Enter the amount to withdraw:")
        var amountsub:Int=scan.nextInt()
        var newbalance = account_balance + amountsub
        println("Balance after withdrawal: $newbalance ")
    }
    fun calculateRateOfInterest(){
        if (accountType == "savings") {
            var intrest = account_balance * 0.06
            println("Rate of intrest=$intrest")
        } else {
            var intrest = account_balance * 0.1
            println("Rate of intrest=$intrest")
        }
    }
    fun getBalance(){
        if(accountType=="savings"){
            var intrest=account_balance*0.06
            var totalbalance=intrest+account_balance
            println("Total balance=$totalbalance")
        }
        else{
            var intrest=account_balance*0.1
            var totalbalance=intrest+account_balance
            println("Total balance=$totalbalance")
        }
    }
}

fun main() {
    var sc=Scanner(System.`in`)
    print("Enter account number: ")
    var accNo=sc.nextInt()
    print("Enter balance : ")
    var balance=sc.nextInt()
    print("Enter account type : ")
    var accountType=sc.next()

    var acc=AccountClass(accNo,balance,accountType)
    println("Enter your choice\n1.withdraw\n2.deposit\n3.calculate rate of intrest\n4.get balance")
    var choice=sc.nextInt()

    when(choice){
        1->acc.withdraw()
        2->acc.deposit()
        3->acc.calculateRateOfInterest()
        4->acc.getBalance()
        else->println("Invalid option")
    }
}