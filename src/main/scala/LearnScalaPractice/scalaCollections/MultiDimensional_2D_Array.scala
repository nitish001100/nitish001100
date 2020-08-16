package LearnScalaPractice.scalaCollections

object MultiDimensional_2D_Array {
  var array1 = (1, 2, 3, 4, 5)
  var array2 = (1, 2, 3, 4, 5)

  def show(array: Array[Array[Int]]): Unit = {

  }

  def main(args: Array[String]): Unit = {
    var multi = Array.ofDim[Int](2, 2)
    MultiDimensional_2D_Array.show(multi)
  }
}
