import org.scalatest.{Matchers, FlatSpec}

class FizzBuzz$Test extends FlatSpec with Matchers {

  import FizzBuzz._

  it should "fizzBuzz buzz" in {

    fizzBuzz(1) should be(1.toString)
    fizzBuzz(2) should be(2.toString)
    fizzBuzz(3) should be("Fizz")
    fizzBuzz(4) should be(4.toString)
    fizzBuzz(5) should be("Buzz")
    fizzBuzz(15) should be("FizzBuzz")
  }

}
