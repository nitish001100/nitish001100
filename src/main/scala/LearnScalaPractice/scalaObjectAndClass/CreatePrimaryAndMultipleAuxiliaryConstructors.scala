package LearnScalaPractice.scalaObjectAndClass


class Employee(empId: Int, name: String, salary: Double) {
  def this(empId: Int, name: String) {
    this(0, "", 0.0) // here it invokes primary constructor.
    println("Two-argument auxiliary constructor")
  }

  def this(empId: Int) {
    this(0, "", 0.0) // here it invokes primary constructor.
    println("One-argument auxiliary constructor")
  }

  def this() {
    this(0) // here it invokes one-argument auxiliary constructor.
    println("Zero-argument auxiliary constructor")
  }

  println("Primary construtor")
}

object CreatePrimaryAndMultipleAuxiliaryConstructors{
  def main(args: Array[String]): Unit = {
    new Employee()
  }
}