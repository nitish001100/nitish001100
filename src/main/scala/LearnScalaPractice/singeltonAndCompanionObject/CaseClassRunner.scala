package LearnScalaPractice.singeltonAndCompanionObject

case class CaseClass(empId: Int, empName: String)

object CaseClassRunner {

  def main(args: Array[String]): Unit = {

    var caseClassObj = CaseClass(101, "Nitish Saxena")

    println(caseClassObj.empId)

    println(caseClassObj.empName)

  }
}
