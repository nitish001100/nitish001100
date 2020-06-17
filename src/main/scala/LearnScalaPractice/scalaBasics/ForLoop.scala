package LearnScalaPractice.scalaBasics

class ForLoop {
  def func(range: Int): Unit ={
    for ( i <- 1 to range) {
      println(i)
    }

    for ( i <- 1 until (range, 2)) {
      println(i)
    }

  }
}
