package LearnScalaPractice.singeltonAndCompanionObject

// When class and Singelton object sharing the same name, then the class known as "Companion Class" and object known as "Companion Object."

class CompanionObject(empId: Int, empName: String) {
  println("Running Companion Class, and you can call it by creating object.")
  println(empId + "," + empName)
}

// If we create the Companion Object, in that case, all the content which is the part of companion object that is static and
// content which is the part of companion class that is accessible thru whie creating object only.

/*object CompanionObject {
  println("Running Companion Object -- ")
  new CompanionObject(101,"Nitish Saxena")
}*/

object CompanionObject {
  new CompanionObject(101, "Nitish Saxena")
  def main(args: Array[String]): Unit = {
    println("Running Companion Object, all behaves like Static.")
    CompanionObject
  }
}
