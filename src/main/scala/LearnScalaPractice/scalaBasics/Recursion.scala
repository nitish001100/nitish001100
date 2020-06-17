package LearnScalaPractice.scalaBasics

object Recursion {

  def recursiveFunction(value1: Int, value2: Int): Int = {
    if (value2 == 0)
      return 0
    else
      return value1 + recursiveFunction(value1, value2 - 1)
  }

  def main(args: Array[String]): Unit = {
    print(recursiveFunction(10, 2))
  }
}
