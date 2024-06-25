import scala.io.Source
object States{
  def main(args:Array[String]):Unit={

    //state where highest gdp contribution
    //find average gdp percapita
    //total gdp
    val filePath = "C:\\Users\\Administrator\\Downloads\\Scala-20240625T052255Z-001\\Scala\\GDP.csv"


    val bufferedSource = Source.fromFile(filePath)


    val lines = bufferedSource.getLines().drop(1)


    var maxGDP = 0
    var stateWithMaxGDP = ""
    var totalGDP = 0
    var totalPerCapitaIncome = 0
    var count = 0

    // Process each line
    lines.foreach { line =>
      val cols = line.split(",")


      val state = cols(0)
      val gdp = cols(1).toInt
      val perCapitaIncome = cols(2).toInt


      if (gdp > maxGDP) {
        maxGDP = gdp
        stateWithMaxGDP = state
      }

      // Calculate total GDP and total per capita income
      totalGDP += gdp
      totalPerCapitaIncome += perCapitaIncome

      // Increment count for averaging later
      count += 1
    }

    // Calculate average GDP per capita
    val averageGDPPerCapita = totalPerCapitaIncome / count

    // Close the file
    bufferedSource.close()

    // Print results
    println(s"State with highest GDP contribution: $stateWithMaxGDP")
    println(s"Average GDP per capita: $averageGDPPerCapita")
    println(s"Total GDP: $totalGDP")


  }
}
