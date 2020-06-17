package LearnScalaPractice.scalaBasics

object AnonymousFunctionORLambdaFunction {


  /** By using ROCKET SIGN. */
  var sum = (value1: Int, value2: Int) => value1 + value2
  var minus = (value1: Int, value2: Int) => if (value1 > value2) value1 - value2 else value2 - value1
  var divide = (value1: Int, value2: Int) => if(value1 > value2) value1/value2 else value2/value1
  var multiply = (value1: Int, value2: Int) => value1 * value2

  /** By using UNDERSCORE(_) SIGN. */

  var sum0 = (_:Int) + (_:Int)
  var diff0 = (_:Int) - (_:Int)
  var multiply0 = (_:Int) * (_:Int)
  var divide0 = (_:Int) / (_:Int)

  def main(args: Array[String]): Unit = {
    var value1 = 10
    var value2 = 20

    // By Rocket Sign
    println(sum(value1,value2))
    println(minus(value1,value2))
    println(divide(value1,value2))
    println(multiply(value1,value2))

    // By Lambda Sign

    println(sum0)
    println(diff0)
    println(multiply0)
    println(divide0)

  }
}
