package LearnScalaPractice.advancedStart

import java.lang.Integer

class Class {

  def func00(): Int = {
    2
  }

  // You can write above function as like this also. Why ??????  -> Because left side return type, scala automatically detects by checking
  // what is the last line return. And as the func is of 0 parameters so it is not necessary to declare empty brackets.

  def func0 = 2


  def func1(value: Int): Int = {
    value
  }


  def func2(value: String): Int = {
    Integer.valueOf(value)
  }
}

object Class {
  def main(args: Array[String]): Unit = {
    var obj = new Class

    println(obj.func1(1))
    println(obj.func1(1))

    println(obj.func2("2"))
    println(obj.func2("2"))


  }
}
