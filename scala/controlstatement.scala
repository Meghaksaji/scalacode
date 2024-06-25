object controlstatement{
  def main(args:Array[String]):Unit= {
    //exampl1. if-else
    //val x1=10
    import scala.io.StdIn
    //    println("Enter a Number:")
    //ask user to input and typecast it to a integer datatype
    //    val x1=StdIn.readLine().toInt
    //
    //    if(x1>0){
    //      println("Value is positive")
    //    }
    //    else if(x1<0){
    //      println("Value is negative")
    //    }
    //      else{
    //
    //        println("Value is zero")
    //      }
    // using if-else as expression
    //val x2 = StdIn.readLine().toInt
    //val output=if(x2%2==0 )"even" else "odd"
    //    print(output)

    //while loop
    var i = 1
    while (i <= 5) {
      println(s"value of i is: $i")
      i += 1
    }

    //example 4
    //for loop
    val list_1 = List("Kerala", "Tamil Nadu", 22, "Trivandrum", 78.892)
    for (value <- list_1) {
      println(value)
    }
    //example ,generate a collection of even numbers
    //yield is used to generate new collection from existing from
    //    val numbers =(1 to 50).toList
    //    val even=for{
    //          num <- numbers
    //          if num %2==0
    //
    //      }yield num
    //    println(even)
    import scala.collection.mutable.ListBuffer

    val evenNumbers = ListBuffer[Int]()

    // Iterate through numbers from 1 to 50
    for (num <- 1 to 50) {
      // Check if the number is even
      if (num % 2 == 0) {
        // If even, add it to the ListBuffer
        evenNumbers += num
      }
    }


    //example 6 -prime numbers
//    val num = (2 to 200).toList
//    val prime = for {
//      n <- num
//      if (2 until n).forall(x => n % x != 0)
//
//
//    } yield n
//    print(prime.mkString(","))
    var primes = ListBuffer[Int]()

    // Loop through numbers from 2 to 200
    for (num <- 2 to 200) {
      var isPrime = true
      // Check if num is divisible by any number from 2 to num-1
      for (i <- 2 until num) {
        if (num % i == 0) {
          isPrime = false
        }
      }
      // If num is prime, add it to the list
      if (isPrime) {
        primes += num
      }
    }
    println(primes.mkString(", "))

    //task 1 processing and filtering data
    //filter out products that have price greater than $200
    //calculate total cost of each product
    //sample record =(productname,unit price, discount ,quantity)
    //print the name of product that has exeeded total cost greater than $1000


    val items = List(("Apple", 80, 20, 10), ("Orange", 70, 10, 5), ("Banana", 100, 30, 17), ("Blueberries", 110, 20, 7), ("Mango", 200, 10, 5))
    var cost = for {
      c <- items
      if (c(1)>50)
    } yield c(0)

  }
}
