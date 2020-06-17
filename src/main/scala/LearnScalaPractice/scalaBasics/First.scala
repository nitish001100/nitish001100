package LearnScalaPractice.scalaBasics

object Main {
  def main(args: Array[String]): Unit = {
    println("First Line..")

    var tempArgs = args;
    tempArgs = callingMain.callingMain()

    for (elem <- tempArgs) {
      print(elem + " ")
      foundObj(elem)
    }

    def foundObj(str: String) = if (tempArgs.apply(0).eq("Hi")) "Found" else "NotFound"

  }

  def foundObj(str: String): Unit = {
    print(str)
  }
}


object callingMain {
  def callingMain(): Array[String] = {
    var array = new Array[String](2);
    array.update(0, "Hi")
    array.update(1, "Bye")

    return array
  }
}
