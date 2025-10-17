package StepikScalaCourse.step2

import scala.annotation.tailrec

object step2_6_10 {

  def calcFuncRec(x: Int, y: Int, n: Int): Int = {
    @tailrec
    def go(x: Int, y: Int, n: Int): Int = {
      if (n == 0) x
      else go(x + y, y, n - 1)
    }
    go(x, y, n)
  }

  def printRec(x: Int) : String = {
    val l = x.toString.length
    @tailrec
    def go(x: Int, l: Int, accum: String): String = {
      if (l == 0) s"$accum$x is the result"
      else go(x, l - 1, s"$accum$x ")
    }
    go(x, l - 1, s"")
  }

  def main(args: Array[String]): Unit = {

//    val x = args(0)
//    val y = args(1)
//    val n = args(2)

    val res = calcFuncRec(10, 1, 5)
    println(printRec(res))
  }



}
