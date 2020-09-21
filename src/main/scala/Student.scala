class Student(studentName: String, studentAge: Int) {

  def execute(): Unit = {
    println(studentName + " -- " + studentAge)
  }
}

object Student {
  def apply(studentName: String, studentAge: Int): Student = {
    new Student(studentName, studentAge)
  }
}



