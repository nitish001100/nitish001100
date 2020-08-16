package LearnScalaPractice.scalaCollections


object Single_1D_Array {
  def show(array: Array[Int]): Unit = {
    for (value <- array) {
      println(value)
    }
  }

  def main(args: Array[String]): Unit = {
    var array1: Array[Int] = new Array[Int](2)
    array1(0) = 10
    array1(1) = 20
    Single_1D_Array.show(array1)
  }
}
