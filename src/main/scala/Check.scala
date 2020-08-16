object Check {
  def main(args: Array[String]): Unit = {
    val thds: Int = 0

    val thds0 = thds match  {
      case (0) => 1
      case (_) => thds
    }

    println(thds0)

    val construct0 = new Construct("N", "S", Option("Nothing"))
    val construct1 = new Construct("H", "S")

    construct0

  }
}


class Construct(fName: String, lName: String, mName: Option[String] = None)


object Construct {

  def print(fName: String, lName:String) = println(fName +" -- " + lName)
  def apply(fName: String, lName: String): Unit =  print(fName, lName)

  def apply(fName: String, mName: String, lName: String): Unit = println()

}