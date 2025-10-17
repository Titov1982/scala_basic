package HiOrderFunction.BehaviorChange

object BehaviorChange {

  def not[A](f: A => Boolean): A => Boolean = a => !f(a)

  def main(args: Array[String]): Unit = {
    println(not((x: Int) => x > 0)(1))
  }
}
