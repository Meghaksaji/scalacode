object Product{
  def main(args:Array[String]): Unit = {


    import scala.collection.mutable.ListBuffer

    // Sample product data as tuples
    val products = List(
      ("Laptop", 1200, 0.1, 5),
      ("Phone", 800, 0.05, 10),
      ("Tablet", 300, 0.0, 8),
      ("Smartwatch", 250, 0.15, 3),
      ("Camera", 400, 0.2, 2)
    )
    val expensiveProducts = ListBuffer[(String, Int, Double, Int)]()
    println("Product with with total cost greater than 200")
    for (product <- products) {
      val (name, unitPrice, discount, quantity) = product
      val totalCost = unitPrice * quantity * (1 - discount)
      if (totalCost > 200.0) {
        expensiveProducts += product

        println(s"Name: $name, Total Cost: $totalCost")
      }
    }
    val productsWithTotalCost = ListBuffer[(String, Double)]()
   println("Products with there total cost")
    for (product <- products) {
      val (name, unitPrice, discount, quantity) = product
      val totalCost = unitPrice * quantity * (1 - discount)
      productsWithTotalCost += ((name, totalCost))

      println(s"Name: $name, Total Cost: $totalCost")
    }
    println("Products with total cost exceeding $1000:")
    for (product <- productsWithTotalCost) {
      if (product._2 > 1000.0) {
        println(product._1)
      }
    }


  }
}
