package StepikScalaCourse.step2

import scala.annotation.tailrec

object step2_6_9_powerOfTwo extends App {

  def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def go(n: Int, acc: BigInt): BigInt = {
      if (n == 0) acc
      else go(n - 1, acc * 2)
    }
    go(n, 1)
  }

  println(powerOfTwo(50))
}
