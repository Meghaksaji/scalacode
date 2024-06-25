object Bank{
  var balance=10000
  def Withdraw(balance:Int,amount:Int):Int={
    if(amount>balance){
      0
    }
    else{
      balance-amount

    }}
   def Deposite(balance:Int,amount:Int):Int={
     balance+amount
   }

    def Checkbalance(balance:Int):Int={

      balance
    }


  def Bankingmenu(): Unit={
    import scala.io.StdIn
    

    var continue=true
    while(continue)
    {
    println("Choose From Below")
    println("1.Check Balance")
    println("2.withdraw Amount")
    println("3.Deposit")
    println("4.exit")
      val input=StdIn.readInt()
      if (input==1){
        println(s"Current Balance: ${Checkbalance(balance)}")
      }
      else if(input==2){
        print("Enter the amount to be withdrawn")
        var amount=StdIn.readInt()
        var value=Withdraw(balance,amount)
        if (value == 0) {
          println("Insufficient balance!")
        } else {
          balance = value
          println(s"Withdrawn $amount. Remaining Balance: $balance")
        }
      } else if(input==3){
        println("Enter the amount to be deposite")
        var amt=StdIn.readInt()

         var value=Deposite(balance,amt)
        balance=value
        println(s"Deposited $amt. New Balance: $value")

      }
      else if(input==4){
          continue=false
        }
//      else if(input==_){
//        println("Invalid option! Please choose a valid option.")}


    }

  }
  def main(args:Array[String]): Unit = {
    Bankingmenu()
  }
}




