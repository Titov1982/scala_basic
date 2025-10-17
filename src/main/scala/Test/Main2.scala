package Test


object Main2 extends App {

  val l1 = 1::2::3::Nil
  val l2 = 4::5::6::Nil

  val res = (l1:::l2)
    .filter(x => x % 2 == 0)
    .map(x => x + 10).foreach(println)

  println(l1:::l2)



}
