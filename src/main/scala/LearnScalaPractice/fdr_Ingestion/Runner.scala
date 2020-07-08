package LearnScalaPractice.fdr_Ingestionobj

import LearnScalaPractice.fdr_Ingestionobj.Runner.func

trait preDefinedFunctions {

  def func(f: (Int, Int) => Int, a: Int, b: Int): Int // Un- Implemented Method.

  def double(a: Int, b: Int): Int = a * 2 + b * 2 // Implemented Method.

  def func(data: String): String = data + "_Iden"

}

class ImplementFunctions extends preDefinedFunctions {

  override def func(f: (Int, Int) => Int, a: Int, b: Int): Int = {
    f(a, b)
  }

  def acceptFunction(data: String, f: (String) => String): String = {
    func(data)
  }

}

object Runner extends ImplementFunctions with preDefinedFunctions {
  def main(args: Array[String]): Unit = {

    val a = 10
    val b = 20

    val runner = Runner

    var result = runner.func(runner.double, a, b)

    println(result)


    /** ********************************************************************** */


    var message = "scala"

    message = runner.acceptFunction(message, runner.func)

    println(message)

  }
}
