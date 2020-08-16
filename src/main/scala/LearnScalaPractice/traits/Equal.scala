package LearnScalaPractice.traits

trait Equal {
  def isEqual(value: Int): Boolean

  def isNotEqual(value: Int): Boolean = {

    if (value == 2)
      true
    else
      false

    value match {
      case 1 => true
      case 2 => true
      case _ => false
    }
  }
}


object Runner extends Equal {

  def main(args: Array[String]): Unit = {
    val value1 = 10
    val value2 = 2
    var result = isEqual(value1)
    println(value1 + " => " + result)
    result = isNotEqual(value2)
    println(value2 + " => " + result)

  }

  override def isEqual(value: Int): Boolean = {
    if (value == 1)
      return true
    else if (value == 2)
      return true

    value match {
      case 1 => true
      case 2 => true
      case _ => false
    }
  }
}
