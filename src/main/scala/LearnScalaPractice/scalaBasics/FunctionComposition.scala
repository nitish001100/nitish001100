package LearnScalaPractice.scalaBasics

object FunctionComposition {

  def multiplyBy2(value: Int): Int = {
    value * 2
  }

  def addBy2(value: Int): Int = {
    value + 2
  }

  def main(args: Array[String]): Unit = {
   println(multiplyBy2(addBy2(2)))
  }

}
