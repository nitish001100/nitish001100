package LearnScalaPractice.scalaBasics

object ScalaFunctionWithVariableLengthParameters {

  def add(values: Int*): Int = {
    var sum = 0

    for (value <- values)
      sum += value


    sum
  }

  def main(args: Array[String]): Unit = {
    println("Addition of all numbers present in the list is = " + add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  }
}
