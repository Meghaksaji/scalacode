object Loopsandfunctions{
  def main(args:Array[String]):Unit={
    // do-while
    var j=1
    while{
      println(j)
      j+=1
      j<=5


    }  do()

    //for loop with range
    for(i<-1 to 10 by 2){
      println(i)
    }
    //iterating over a collection
    val fruits=List("apples","cherry","oranges","pineaaple","strawberry")
    for (value<- fruits){
      println(value)

    }

    //complex condition
    import scala.io.StdIn
//    println("enter the temperature")
//    val temperature=StdIn.readInt()
//    println("enter the humidity")
//    val humidity=StdIn.readInt()
//    val weatherdesc=if(temperature>30 &  humidity>60){
//      "Hot & Humid"
//    }else if(temperature >45 & humidity<60){
//      "Hot"
//    }else if(humidity >70 & temperature <25){
//      "Humid"
//    }else{
//      "Pleasant"
//    }
//    println(weatherdesc)


    //functions
    def add(a:Int,b:Int):Int={
      a+b
    }
    //anonymous function
    val summation=(a:Int,b:Int)=> a+b
    println(summation(5,6))
    //find maximum element
    def findmax(lst:List[Int]):Int={
      lst.max
    }

    val numbers=List(1,3,5,8,7,1)
    val maxnum =findmax(numbers)
    println(maxnum)

    //recursive function
    def factorial(num:Int):Int={
      if(num==0) 1
      else num* factorial(num-1)
    }
    val fact=factorial(6)
    println(fact)
    
    
    
  }
}
