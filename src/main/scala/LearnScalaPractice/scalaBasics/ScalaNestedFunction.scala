package LearnScalaPractice.scalaBasics

object ScalaNestedFunction {

  def function1(a: Int, b: Int, c: Int, d: Int): Int = {

    def function2(c: Int, d: Int): Int = {
      c + d
    }

    a + b + function2(c, d)
  }


  def main(args: Array[String]): Unit = {
    println(function1(10, 20, 30, 40))
  }
}
