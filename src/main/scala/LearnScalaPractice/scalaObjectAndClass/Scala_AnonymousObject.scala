package LearnScalaPractice.scalaObjectAndClass


class Employee1 (var empId: Int, var empName: String) {
  def get(): Unit ={
    println(empId+","+empName)
  }
  println(empId+","+empName)
}

object Scala_AnonymousObject {
  def main(args: Array[String]): Unit = {
    new Employee1(101, "Nitish Saxena")
  }
}


