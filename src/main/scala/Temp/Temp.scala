package Temp

object Temp {
  def main(args: Array[String]): Unit = {

    val list1: List[Int] = 1 +: 2 +: 3 +: Nil   // Создание списка
    val list2 = list1 ::: 4 +: 5 +: 6 +: Nil    // Объединение списков
    val list3 = list2 :+ 10                     // Добавление элемента в конец списка

    println(list3)

    // Получение элемента списка
    list3 match {
      case Nil => println("Nil")
      case head +: tail =>
        println(head)
        println(tail)
    }

  }

}
