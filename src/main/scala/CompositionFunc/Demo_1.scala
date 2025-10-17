package CompositionFunc

object Demo_1 extends App {

  def sum: (Int, Int) => Int = (a: Int, b: Int) => a + b
  def mul: (Int, Int) => Int = (a: Int, b: Int) => a * b

//  def sumAndMul: ((Int, Int) => Int)) = sum compose mul

//  println(sum compose mul)(1, 2))



}
