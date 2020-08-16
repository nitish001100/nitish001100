package LearnScalaPractice.advancedStart

case class ForRunner3(fName: String, lName: String)

object Runner2 {
  def main(args: Array[String]): Unit = {
    val runner3Obj = Runner3("Nitish", "Saxena")
    println(runner3Obj.fName+" , "+runner3Obj.lName)
  }
}

object Runner3 {
  def apply(fName: String, lName: String): ForRunner3 = {
    ForRunner3(fName, lName)

  }
}
