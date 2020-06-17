package LearnScalaPractice.scalaBasics

object HelloWord {
  def main(args: Array[String]): Unit = {
    HelloWorld_Class.fun1(10)
    var obj1Data = if((new ObjectsList().obj1.a : Int) == 10) "Match" else "Not Match"
    print(obj1Data)

  }
}

object HelloWorld_Class {
  def fun1(a: Int): Unit = {
    println(a)

    var value = scalaExample
    println(value)
  }

  def scalaExample: String = {
    return "Hello World"
  }

}


class ObjectsList {

  object obj1 {
    var a: Int = 10
  }

}
