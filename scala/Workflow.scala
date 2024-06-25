object Workflow{
  def main(args:Array[String]):Unit={
   //map function-transform each elemnt of a coolection using given function
   val numbers=List(1,2,3,4,5,6,7,8)
    val doublenum= numbers.map(_*2)
    println(doublenum)
    val concat=numbers.map(_+"number")
    println(concat)
    concat.foreach(println)


    val words=List("Dubai","chicago","newyork","berlin","paris")
    val length =words.map(_.length)
    println(length)

    // flatmap -flattens collection into single collection
    val nestedlist=List(List(1,2,3),List(4,5,6),List(7,8,9))
    val a= nestedlist.flatMap(identity)

    val sentences= List("Hello scala you are awesome","scala is funny")
    val word=sentences.flatMap(_.split(" "))
    println(word)

    //filter-it selects element from collection that satisfy a given condition
    val shortwords=word.filter(_.length <=4)
    println(shortwords)
    //fold:this combines elemets of collection using a binary operation starting with a initial value
    val num=List(123,456,567)
    println(num.fold(550)(_+_))//


    //reduce-this fucntion combines elements of collection
    val w=List("Ust","is","best")
    val combine=w.reduce(_+" "+_)
    println(combine)

    //foreach-function that applies a given procedure to each element of a function
    word.foreach(w=>println(w.toUpperCase))
    //collect-applies to partial function to the elements of collection and returning a new collection
     val num1=List(1,2,3,4,5,6,7,8)
    val  even=num1.collect{case x if x%2==0 =>x}
    val odd = num1.collect{case x if x % 2 !=0 =>x }

    val w2=List("hello","howareyou","welcome","hi","by","pineapple")
    val largeword= w2.collect{case w if w.length >=5 => w}
    println(largeword)

    //partition-splits the collection into two part based on condition
    val (short,long)=w2.partition(_.length<4)
    println(short)
    println(long)

    //groupby group a collection based on a given function
    val num2=List(11,23,56,36,12,79)
    val s=num2.groupBy(_%2 )
    val s2 = num2.groupBy(_ % 2==0)
    println(s)
    println(s2)

    //scan-similar to fold ,but it returns a collection of successive cumulative value of the binary operation
    val cum=num2.scan(0)(_+_)
    println(cum)





  }
}
