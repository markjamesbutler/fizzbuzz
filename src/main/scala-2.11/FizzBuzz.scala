import scala.math._

object FizzBuzz {

  /*
  "Write a program that prints the numbers from 1 to 100. But for multiples of
  three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
  For numbers which are multiples of both three and five print “FizzBuzz”."
   */

  def fizzBuzz: List[String] = {

    val n = (1 to 100).toList
    val i = n.map(fizz(_))
    print(i)
    i
  }

  def fizz(i: Int): String ={
    if (i % 15 == 0) "FizzBuzz"
    else if (i % 3 == 0) "Fizz"
    else if (i % 5 == 0) "Buzz"
    else i.toString
  }



}
