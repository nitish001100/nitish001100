package LearnScalaPractice.scalaObjectAndClass

class Scala_Mix_Primary_Auxiliary_Constructor(empId: Int, empName: String) {

  var empDept: String = null

  def this(empId: Int, empName: String, empDept: String) {
    this(empId, empName)
    this.empDept = empDept
  }

  def print(): Unit = {
    println("Dept = " + empDept + " empName = " + empName + " empId = " + empId)
  }


}

object MixedConstructors {
  def main(args: Array[String]): Unit = {
    new Scala_Mix_Primary_Auxiliary_Constructor( 150975, "Nitish Saxena", "IT").print()
  }
}
