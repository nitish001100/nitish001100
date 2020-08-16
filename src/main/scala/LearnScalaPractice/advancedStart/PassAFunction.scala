package LearnScalaPractice.advancedStart

trait AllFunction {
  def toPassOne(value: Int): Int
}

object PassAFunction extends AllFunction {

  override def toPassOne(value: Int): Int = {
    value
  }


  def main(args: Array[String]): Unit = {


    def acceptToPassFuncOneParams(newName: (Int) => Int): Int = {
      newName(2) + 2
    }

    //  In below we define a function separately and call the function by it's name.
    val result0 = acceptToPassFuncOneParams(toPassOne)

    // OR //

    //  In below we define function ANONYMOUSLY.
    val result1 = acceptToPassFuncOneParams((value: Int) => {
      value
    })


    print(result0)
    print(result1)


  }
}
