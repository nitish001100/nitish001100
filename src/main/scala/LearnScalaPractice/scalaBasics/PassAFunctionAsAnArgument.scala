package LearnScalaPractice.scalaBasics

object PassAFunctionAsAnArgument {

  def multiplyBy2(a: Int): Int = {
    a * 2
  }

  def main(args: Array[String]): Unit = {
    func(10, multiplyBy2)
  }

  def func(value : Int, idenFunc:Int => Int): Unit = {
    callFunc(idenFunc(value)+1.0)
  }

  def callFunc(value:AnyVal){
    println(value)
  }

}
