package LearnScalaPractice.scalaBasics

import java.util.Scanner

object PatternMatching {
  def main(args: Array[String]): Unit = {

    /** Without returning from Match Case, Just print the value. */
    var a = 1

    a match {
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
    }

    /** How to return the value from Match Case. */
    var output: String = a match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Nothing Found!!"
    }

    println(output)

    var value: Any = new Scanner(System.in);
    var valueType: Any = null;


    if (value.isInstanceOf[String]) {
      valueType = "String"
    } else {
      valueType = "Int"
    }


    if (valueType.equals("String")) {
      value match {
        case "ABC" => "Input is ABC, which is equivalent to Nitish Saxena. "
        case "DEF" => "Input is DEF, which is equivalent to Harshit Saxena. "
      }
//    } else {
//      value match {
//        case 1 => "Nitish Saxena"
//        case 2 => "Harshit Saxena"
//      }
    }

    println(output)

  }
}
