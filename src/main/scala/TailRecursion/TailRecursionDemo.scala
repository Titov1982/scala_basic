package TailRecursion

import scala.annotation.tailrec

/**
 * Tail recursion demo
 */
object TailRecursionDemo extends App {

  /**
   * Tail recursion print list
   *
   * @param list list to print
   */
  @tailrec
  def printList[A](list: List[A]): Unit = {
    list match {
      case Nil => println("Nil")
      case x :: xs => println(x); printList(xs)
    }
  }

  /**
   * Tail recursion reverse list
   *
   * @param list list to reverse
   * @return list in reverse order
   */
  def reverseList[A](list: List[A]): List[A] = {
    @tailrec
    def go(list: List[A], acc: List[A]): List[A] = {
      list match {
        case Nil => acc
        case x :: xs => go(xs, x :: acc)
      }
    }

    go(list, Nil);
  }

  /**
   * Tail recursion fibonacci sequence
   *
   * @param n numbers count to calculate sequences.
   * @return fibonacci
   */
  def fibonacci(n: Int): Int = {
    @tailrec
    def go(n: Int, prev: Int, current: Int): Int = {
      if (n == 0) prev
      else go(n - 1, current, prev + current)
    }

    go(n, 0, 1)
  }

  /**
   * Tail recursion sum numbers
   * @param n numbers count to sum up
   * @return sum up numbers
   */
  def sumNumbers(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int = {
      if (n == 0) acc
      else go(n - 1, acc + n)
    }
    go(n, 0)
  }


  printList(List(1, 2, 3))
  printList(reverseList(List(1, 2, 3)))

  println(fibonacci(10))

  println(sumNumbers(5))
}
