package oop

object AccessorAndMutator extends App {

  class A {
    private[this] var privateX: Int = 1;
    // accessor
    def x: Int = {
      println("Hello from accessor")
      privateX
    };
    // mutator
    def x_=(x: Int): Unit = {
      println("Hello from mutator")
      privateX = x
    };
  }

  val c = new A
  c.x = 2
  println(c.x)

}
