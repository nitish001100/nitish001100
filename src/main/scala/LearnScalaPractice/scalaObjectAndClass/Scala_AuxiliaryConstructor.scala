package LearnScalaPractice.scalaObjectAndClass


class Scala_AuxiliaryConstructor() {

  var empId: Int = 0

  def this(empId:Int) {
    this()
    this.empId = empId
  }

  def display() = println(empId)

  override def toString: String = "Iden empId = " + empId
}

object Main {
  def main(args: Array[String]): Unit = {
    var obj = new Scala_AuxiliaryConstructor(100)
    obj.display()
    println(obj.toString)

  }
}
