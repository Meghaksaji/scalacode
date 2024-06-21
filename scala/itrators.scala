object Itera{
  def main(args:Array[String]):Unit= { //itrator in scala represent a sequence of element that allows you to traverse through a collection sequentially
    val mylist = List(20,30, 40, 50, 60, 70, 80, 90)
    val iter = mylist.iterator
    //methods of iterators to check if there is more element .hasNext(),.next()-to retrieve next value
    //.remove()-to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())
    println(iter.next())
    //lazy initialization
    lazy val donuts: Int = 100 //lazy should only be used with val
    println(donuts * 5)
  }}



