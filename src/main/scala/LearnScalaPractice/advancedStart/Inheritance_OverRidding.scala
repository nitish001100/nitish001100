package LearnScalaPractice.advancedStart


class A(value: Int) {
  def func = value
}


class B extends A(10) {
  override def func: Int = super.func
}

object Inheritance_OverRidding {
  def main(args: Array[String]): Unit = {
    val b = new B
    println(b.func)


  }
}
