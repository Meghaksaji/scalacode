object Methods {
  def main(args: Array[String]): Unit = {

    //list and methods
    val list_1 = List("apple", "banana", "cherry", "orange", "watermelon")
    //empty list
    val list_o = List()
    val firstelement = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)
    println(secondelement)
    //check if collection is empty
    //  a=list_1.isEmpty()

    //size

    val lengthoflist = list_1.length
    //adding or removing values from list
    val list_2 = List(2, 4, 6, 8, 1, 4, 3)
    val newlist = 0 :: list_2 // add value  in begining(i.e 0)
    val appendlist = list_2 :+ 9 // add values at end(i.e 9)
    println(newlist)
    println(appendlist)

    //concatination

    val concatinated = list_2 ::: List(9, 10, 11, 12)
    val concat = list_2 ++ List(9, 7, 2, 6)
    println(concatinated)
    println(concat)


    //remove-/drop elements from the begining
    println(list_2.drop(3))
    //remove by value
    val updatedlist = concatinated.filter(_ != 3) //value that is 3 will be removed
    val updatedlist1 = concatinated.filter(_ >= 3)
    val updatedlist2 = concatinated.filter(_ % 3 == 0)

    //drop multiple elements
    val update_1 = concatinated.diff(List(3, 4, 5))
    //transforming lists
    list_2.map(_ * 2)
    //even numbers
    list_2.filter(_ % 2 == 0)
    //bested list to single list
    val nested = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val flat = nested.flatMap(identity)
    println(flat)
    //sum all the numbers
    val sum = flat.reduce(_ + _) //aggregate operation
    val mul = flat.reduce(_ * _)
    println(sum)
    println(mul)

    //slicing
    println(list_1.take(3)) //first 3 elemets
    println(list_1.takeRight(3)) //last 3 element
    println(list_1.dropRight(2)) //drop last two values
    println(list_1.slice(1, 4)) //start value 1 and end value 3


    //converting list to map
    val listoftuples = List(("UST1001", "Krishna"), ("UST1002", "Rohit"), ("UST1003", "Adinan"))
    val map = listoftuples.toMap
    println(map)

    //zipping
    val l1 = List("a", "b", "c")
    val l2 = List(1, 2, 3)
    val ziplist = l1.zip(l2)
    println(ziplist)

    val (alpha, numbers) = ziplist.unzip
    println(alpha)
    println(numbers)

    //SETS
    val set1 = Set(1, 2, 3, 4, 5, 6, 7, 8)
    val set2 = Set("apple", "orange", "cherry", "banana", "watermelon")

    println(set1.contains(3)) //returns boolean outcome
    //adding value
    set1 + 9
    //removing
    set1 - 9
    //set operations
    val setA = Set(10, 20, 30, 40)
    val setB = Set(50, 60, 70, 80, 40, 30)
    val unionset = setA union setB
    val inter = setA intersect setB
    val diff = setA diff setB

    //subset check
    setA.subsetOf(setB)

    val a = setA.map(_ * 5)
    println(a)

    val b = setA.filter(_ % 3 != 0)
    println(b)

    val c = setA.reduce(_ * _)
    println(c)

    setA.foreach(println)
    //*****************************************************************

    //arrays-mutable
    val arr1 = Array("kochi", "varkala", "trivandrum", "alapuzha")
    val arr2 = Array(1, 2, 3, 4, 5, 6)
    //empty array
    val emp = Array[Int]()
    //update
    arr1(0) = "aluva"
    //arr2 += 9//fixed size ,no adding or removing

    import scala.collection.mutable.ArrayBuffer
    val arrb = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)
    //adding elements
    arrb += 9
    //removing
    arrb -= 5
    //map
    arrb.map(_ * 2)
    //typecast
    val arr3 = arrb.toArray

    //nested array
    val nestarr = Array(Array(1, 2), Array(5, 7), Array(6, 8))
    val f = nestarr.flatten
    //all discussed earlier will work
    //slicing

    f.slice(1, 5)

    val arr4 = Array(30, 40, 10, 80, 60, 20, 50)
    val n = arr4.sorted
    n.foreach(println)
    val k = arr4.reverse
    k.foreach(println)

    //groupby
    val arr5 = Array("kochi", "varkala", "trivandrum", "alapuzha")
    val g = arr5.groupBy(_.length)
    g.foreach { case (length, strings) =>
      println(s"Length $length: ${strings.mkString(", ")}")
    }
    val gr = arr5.groupBy(_.charAt(0))
    g.foreach { case (length, strings) =>
      println(s"Length $length: ${strings.mkString(", ")}")
    }

    val groupbyeven = f.groupBy(num => if (num % 2 == 0) "even" else "odd")
    groupbyeven.foreach {
      case (key, value) => println(s"$key:${value.mkString(",")}")
    }

    // FIRST WAY
    val array7 = Array("hello", "apple", "orange", "banana", "strawberry")
    val group = array7.groupBy(vow => if ("aeiouAEIOU".contains(vow.head)) "vowels" else "consonants")
    group.foreach {
      case (key, value) => println(s"$key:${value.mkString(",")}")
    }

    //SECOND WAY
    val voww = Set('a', 'e', 'i', 'o')
    val grr = array7.groupBy(name => if (voww.contains(name.charAt(0).toLower)) "Vowel" else "consonanats")
    grr.foreach {
      case (key, value) => println(s"$key:${value.mkString(",")}")
    }

    // third way
    //    import scala.collection.mutable.ArrayBuffer

    //    val arr = ArrayBuffer[String]()
    //    var x = 1
    //    import scala.io.StdIn
    //    while (x <= 5) {
    //      val input = StdIn.readLine()
    //      arr += input
    //      x += 1
    //    }

    //    val grpc = arr.groupBy(nam => if ("AEIOUaeiou".contains(nam.head)) "Vowels" else "Consonants")
    //    for ((key, value) <- grpc) {
    //      println(key)
    //      value.foreach(println)
    //    }
    //  }


    //collection map

    val immutableMap = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5)
    import scala.collection.mutable
    val mutablemap = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5)
    //immutable.contains('a')
    //print the output stored in key
    //println(immutableMap("a"))
    //concat two map
    val mapa = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val mapb = Map("e" -> 5, "f" -> 6, "g" -> 7)
    val mergemap = mapa ++ mapb
    println(mergemap)
    //transforming keys and values)]
    val increval = immutableMap.mapValues(_ + 1)//changing value
    val transformkey = immutableMap.map { case (k, v) => (k.toUpperCase, v)//changing key
      increval.foreach {
        case (key, value) => println(s"$key -> $value")
      }


    }

  }
}
