package LearnScalaPractice.scalaObjectAndClass

class PrimaryConstructor(corpEmpId: Int, corpEmpName: String) {
  def getVars(): Unit ={
    println(corpEmpId+","+corpEmpName)
  }
}

object Runner {
  def main(args: Array[String]): Unit = {
    var obj = new PrimaryConstructor(150975, "Nitish Saxena")
    obj.getVars()
  }
}
