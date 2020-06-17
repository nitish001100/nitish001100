package LearnScalaPractice.scalaBasics

object PatternMatching_2 {

  def main(args: Array[String]): Unit = {
    var result = search("Hello")
    println(result)
  }

  def search(a: Any): Any = a match {
    case "Hello" => "Hello"
    case 1 => println(1)
    case 'c' => println("Character 'c' found!!")
    case 2 => "Two"
  }


  var a: Any = "Hello"

  var result = a match {
    case "Hello" => "Hello"
    case 1 => println(1)
    case 'c' => println("Character 'c' found!!")
    case 2 => "Two"
  }

  println(result)
}
