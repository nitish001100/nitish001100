package LearnScalaPractice.advancedStart

object Runner {
  def main(args: Array[String]): Unit = {
    var fName = "Nitish"
    var lName = "Saxena"
    val defineValues = DefineValues(fName, lName)
    val rs = Imp(defineValues.fName, defineValues.lName)
    rs.printFName()
    rs.printLName()
  }
}
