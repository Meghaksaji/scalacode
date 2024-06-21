object Datatype{
   def main(args:Array[String]):Unit={
//     val lsitvariable:List[String]=List("apple","orange","watermelon","grapes","guava")
//       println("first element " +lsitvariable.head)
//     println("value excluding first element " +lsitvariable.tail)
//     println("value including first element " +lsitvariable.head)
//     println(lsitvariable.tail)

     //another syntax
//     val list1=List("Hadoop","spark","flune",true,3.0013)
//     println(list1)
//     println(list1.getClass)
//     println(lsitvariable.getClass)

     //empty list declration
//     val emptylist:List[Nothing]=List()
     //Array data type-array is mutable,fixed size of collection
     //array is homogeneous collection
//     val array=Array("Hadoop","spark","flune")
     //prints element by element output in new line
//     array.foreach(println)
//     println(array.mkString(","))
     //updating value in array even though it was val
//    array(0)="MANGO"
//     println(array.mkString(","))


    // empty array
//    var  a =new Array[String](10)
     //2 d array
//     val a2= Array.ofDim[Int](2,2)
//     a2(0)(0) = 234
//     a2(0)(1) = 246
//     a2(1)(0) = 334
//     a2(1)(1) = 186

     //print the array-cant print array in 2d format
//     val flattenArray:Array[Int]=a2.flatten
//     println(flattenArray.mkString(","))

     // change value a2(0)(1)=34

     //list declration
//     val list2=10::20::30::40::Nil

     //list buffer of type mutable
//     import scala.collection.mutable.ListBuffer
//     var cities=new ListBuffer[String]()
//     cities +="Thiruvanathapuram"
//     cities += ("Mumbai","Delhi","Pune")
//     cities -="Mumbai"
//     println(cities)
     //typecasting is done by to and datatype function
//     cities.toList
//     cities.toSeq

//set collection :Immutable
//hashset- mutable sets
//val set_1:Set[String]=Set()
//val set_2=Set("Mumbai","Delhi","Pune")
//
//     import scala.collection.mutable.Set
//     val mutable=Set("Mumbai","Delhi","Pune")
//     mutable +="Chennai"
//     mutable -="Delhi"
//tuple-is fixed size,can have mutliple datatypes,immutable
//indexing starts from 1

//val tup1=(10,20,30,40,50,60,70,80)
//println(tup1._2)//printing second element

//maping
//key value pairs,each key is unique,similar to dictionary in python
//
//import scala.collection.immutable.Map
     //empty variable declaration
//     var mapvar:Map[String,Int]=Map()
//     var mapvar1=Map("UST101" -> "Sandeep","UST102" -> "Midhun","UST1003" ->"Vinesh")
//     println(mapvar1.contains("UST102"))
//     println(mapvar1.get("UST1003"))
//     println(mapvar1.values)
//     println(mapvar1.keys)
     import scala.collection.mutable.Map
     val mutab1=Map("UST101" -> "Sandeep","UST102" -> "Midhun","UST1003" ->"Vinesh")
     //updating
     mutab1("UST101")="Rohit"
     mutab1+=("UST1004"->"Siva")
       










   }
}
