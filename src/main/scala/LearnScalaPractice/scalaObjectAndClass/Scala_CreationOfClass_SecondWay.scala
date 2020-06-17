package LearnScalaPractice.scalaObjectAndClass


class Student(studentId: Int, studentName: String) {
  def print(): Unit = {
    println(studentId + "," + studentName)
  }
}


object MainRunner {
  def main(args: Array[String]): Unit = {
    var student = new Student(101, "Nitish Saxena")
    student.print()
  }
}