package HiOrderFunction.LogRunningTimeWrapper

object LogRunningTimeWrapper {

  // Wrapper
  def logRunningTime[A, B](f: A => B): A => B = a => {
    val start = System.currentTimeMillis()
    val b = f(a)
    val end = System.currentTimeMillis()
    println(s"Running time: ${end - start} ms")
    b
  }

  def doSomething(a: Int): Int = {
    var i = 0
    while (i < a) {
      i += 1
    }
    i
  }


  def main(args: Array[String]): Unit = {

    val doSomethungWithRunningTime: Int => Int = logRunningTime(doSomething)

    println(doSomethungWithRunningTime(1_000_000_000))
  }

}
