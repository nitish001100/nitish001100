package LearnScalaPractice.singeltonAndCompanionObject

class Check {
  def function0(): Unit ={
    println("Under Check Function")
  }
}

object SingeltonObject {
  // #1 You can call functions directly which is inside class/Object.
  def function0(): Unit ={
    println("Under Main Object Function")
  }

  // #2 While calling a class you need to create a object.
  def main(args: Array[String]): Unit = {
    function0() //#1
    new Check().function0() //#2
    // #3 You can call directly a content of Singleton object (content like functions).
    CreateOneMoreObject.function2()
  }
}

object CreateOneMoreObject{
  def function2(): Unit ={
    println("Inside create One More Object Function.")
  }
}
