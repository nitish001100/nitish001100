package LearnScalaPractice.scalaBasics

object Yield {
  def main(args: Array[String])
  {
    // Using yield with for
    var print = for( i <- 1 to 10) yield i
    for(j<-print)
    {
      // Printing result
      println(j)
    }
  }
}
