package LearnScalaPractice.advancedStart

class Options {
  def funcAcceptMap(map: Map[String, String], toFindKey: String): Option[String] = {

    var res: Option[String] = (toFindKey) match {
      case toFindKey => map.get(toFindKey)
      case _ => None
    }

    res
  }
}


object ClassName {

}

case class ClassName(value1: String, value2: String)

object Options extends Options {
  def main(args: Array[String]): Unit = {
    var map = Map(
      "fName" -> "Nitish",
      "lName" -> "Saxena"
    )

    val toFindKey = "fName"

    var value = funcAcceptMap(map, toFindKey)

    println(value)


    ClassName("", "")
  }
}


