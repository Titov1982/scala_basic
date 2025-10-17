package CompositionFunc

object Demo_2 {
  // A Scala program to illustrate
  // compose method with val function

  // Main method
  def main(args: Array[String]): Unit = {
    println((add compose mul)(2))

    // adding more methods
    println((add compose mul compose sub)(2))
  }

  val add: Int => Int = (a: Int) => a + 1

  val mul: Int => Int = (a: Int) => a * 2

  val sub: Int => Int = (a: Int) => a - 1

}
