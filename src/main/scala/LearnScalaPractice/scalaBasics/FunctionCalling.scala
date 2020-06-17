package LearnScalaPractice.scalaBasics

object FunctionCalling {
  def main(args: Array[String]): Unit = {
    function(10, 20)
    function()
    function(b = 20, a = 10)
  }

  def function(a: Int = 0, b: Int = 0): Unit = {
    println("Here a = "+a+" b = "+b  + " and sum = " + (a + b))
  }
}
