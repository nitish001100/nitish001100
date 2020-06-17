package LearnScalaPractice.scalaObjectAndClass

import java.util

class Student_POJO {
  var studentId: Int = 0
  var studentName: String = null

  def setStudentMembers(studentId: Int, studentName: String): Unit = {
    this.studentId = studentId
    this.studentName = studentName
  }

  def getStudentMembers(): util.ArrayList[Object] = {
    var list = new util.ArrayList[Object]()
    list.add(Integer.valueOf(studentId))
    list.add(String.valueOf(studentName))
    list
  }


  override def toString: String = {
    "Iden toString Overrides, Student_POJO = " + studentName + "," + studentId
  }


}

object Scala_CreationOfClass {
  def main(args: Array[String]): Unit = {
    var studentPOJOObj = new Student_POJO
    studentPOJOObj.setStudentMembers(101, "Nitish Saxena")
    println(studentPOJOObj.toString)

    var list = studentPOJOObj.getStudentMembers()
    var itr = list.iterator()

    while (itr.hasNext) {
      println(itr.next())
    }
  }
}