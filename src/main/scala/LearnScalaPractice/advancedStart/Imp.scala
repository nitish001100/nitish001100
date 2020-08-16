package LearnScalaPractice.advancedStart


class Imp(fName: String, lName: String) {
  def printFName(): Unit = {
    println(fName)
  }

  def printLName(): Unit = {
    println(lName)
  }

}

object Imp {
  //  def apply(fName: String, lName: String): Imp = new Imp(fName, lName)
  def apply(fName: String, lName: String): Imp = new Imp(fName, lName)
}


