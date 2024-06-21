//object is a singleton instance that is lazily initialized when it is first accessed
//when it is first accessed .it is similar to class but only one instsnce will be created automatically

object Data{
  //main is the entry point to any scala application
  //unit defines that the return of main function is nothing
  def main(args:Array[String]): Unit={
    //integer
    val intNum: Int=20
    val longNum:  Long=123456789L
    val shortNum: Short=32765
    val ByteNum: Byte=127

    //floating type
    val FloatingNum :Float=3.14f
    val doublen :Double=3.415945678987654345673

    //string
    val stringv : String="Hello Scala"

    //character
    val charv:Char ='A'
    //mutable
    //boolean

    var boolvar: Boolean=true

    var intvar: Int=293747

    //unit data type
    val unitv :Unit=()
    //printing value,sindicate string
    println(s"Integer:$intNum")
    println(s"Double:$doublen ")
    println(s"Byte:$ByteNum")
    println(s"String:$stringv")
    println(s"Boolean:$boolvar")
    println("Boolean "+boolvar)
    print("Integer Variable "+intvar)

    //update item assignment in mutable varialble
    intvar=intvar +10000
    println(" updated Variable "+intvar)



  }

}