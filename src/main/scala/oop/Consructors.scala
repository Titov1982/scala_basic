package oop

object Consructors extends App {

  class A(_x: Int, _y: Int) {
    var x: Int = _x;
    val y: Int = _y;
  }

  class B(var x: Int, var y: Int)

  // protected class   protected constructor   protected field x
  protected class C protected (protected var x: Int, var y: Int)

  val a = new A(2, 5)
  a.x = 3
//  a.y = 4
  println(a.x, a.y)

//  val b = new B(2, 5)
//  val b = new B(x = 2, y = 5)
  val b = new B(y = 5, x = 2)
  b.x = 3
  b.y = 4
  println(b.x, b.y)
}
