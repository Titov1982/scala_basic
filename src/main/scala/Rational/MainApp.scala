package Rational

object MainApp extends App {

  val r1 = new Rational(1,2)
  val r2 = new Rational(2,3)
  println(r1 + r2)

  val r3 = new Rational(2)
  println(r3 + r1)

  val r4 = new Rational(1,2) + 1
  println(r4)

  val r5 = 1 + new Rational(1,2)
  println(r5)

  println(new Rational(0,5))
  println(new Rational(0,5) + 1)
}
