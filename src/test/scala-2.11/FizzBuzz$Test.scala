import org.scalatest.{Matchers, FlatSpec}

class FizzBuzz$Test extends FlatSpec with Matchers {

  import FizzBuzz._

  it should "print correctly" in {

    fizz(1) should be(1.toString)
    fizz(2) should be(2.toString)
    fizz(3) should be("Fizz")
    fizz(4) should be(4.toString)
    fizz(5) should be("Buzz")
    fizz(15) should be("FizzBuzz")

  }

}
