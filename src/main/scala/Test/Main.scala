package Test

object Main {
  def main(args: Array[String]): Unit = {

    val vec = Vector[Int](1,2,3)
    vec.map(i => i * 2).map(i => i.toString).reduce((a,b) => a + b).foreach(res => printf("%s ", res))



    final case class Person(name: String, age: Int)

    val p1 = Person("John", 20)
    val p2 = Person("Mary", 25)
    val p3 = Person("Bob", 30)
    val p4 = Person("Alice", 35)
    val p5 = Person("Tom", 40)

    val people = Vector(p1, p2, p3, p4, p5)

    val res: Vector[String] = people.map(p => p.name).toVector
  }

}