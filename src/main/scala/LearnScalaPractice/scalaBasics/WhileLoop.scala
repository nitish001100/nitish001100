package LearnScalaPractice.scalaBasics

class WhileLoop {

  object whileLoop {
    def func(value: Int): Unit = {
      var value1 = value
      while (value1 > 0) {
        println(value1)
        value1 -= 2
      }
    }
  }
  var value = 10;
  whileLoop.func(value)
}

