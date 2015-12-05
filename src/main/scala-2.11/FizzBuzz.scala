import scala.collection.parallel.immutable.ParSeq
import scala.math._

object FizzBuzz {

  /*
  "Write a program that prints the numbers from 1 to 100. But for multiples of
  three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
  For numbers which are multiples of both three and five print “FizzBuzz”."
   */

  def apply: ParSeq[String] = {

    val n = (1 to 100).toVector
    val i = n.par.map(fizzBuzz)
    i
  }

  def fizzBuzz(i: Int): String = {
    if (i % 15 == 0) "FizzBuzz"
    else if (i % 3 == 0) "Fizz"
    else if (i % 5 == 0) "Buzz"
    else i.toString
  }

}
