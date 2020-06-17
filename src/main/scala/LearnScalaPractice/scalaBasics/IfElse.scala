package LearnScalaPractice.scalaBasics

object IfElse {
  var constants1: String = "Divisible by 2"
  var constants2: String = "Not Divisible by 2"

  def main(args: Array[String]): Unit = {
    var value = if (execution1(10) == 0) constants1 else constants2

    print(if (value.eq(constants1)) constants1 else constants2)

  }

  def execution1(a: Int): Int = {
    return if (a % 2 == 0) 0 else 1
  }
}
