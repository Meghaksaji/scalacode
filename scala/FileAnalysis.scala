import scala.io.Source
object FileAnalysis{
  def main(args:Array[String]): Unit = {
    val filePath="C:\\Users\\Administrator\\Documents\\tourism.txt"
    //read the file from path

     val source=Source.fromFile(filePath)
    //read all lines from file
    val lines=source.getLines().toList

    source.close()
    //count the words
    val words=lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    //print the words
    //words.foreach(println)
    val groupedWords=words.groupBy(identity)
    val wordcount= groupedWords.mapValues(_.size).toSeq.sortBy(-_._2)
    wordcount.take(10).foreach{case (word,count) =>println(s"$word: $count")}

    //average word length
    val totalwords=words.length
    val totalChars=words.map(_.length).sum
    val avgWordLength=if(totalwords >0)
      totalChars.toDouble/totalwords else 0.0
    println(avgWordLength)


  }

}
