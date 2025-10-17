package HiOrderFunction.ChangeFunction

/**
 * Объект с реализацией частичного применения функции.
 */
object ChangeFunction {

  /**
   * Частично применяет первый аргумент к функции с двумя параметрами.
   *
   * @param a фиксированный первый аргумент
   * @param f функция с двумя аргументами
   * @return новая функция, принимающая второй аргумент и возвращающая результат
   */
  def partial[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  /**
   * Пример простой функции: сложение двух чисел.
   */
  def sum(a: Int, b: Int): Int = a + b

  /**
   * Частично применённая функция суммы с первым аргументом 2.
   */
  val sumPartial: Int => Int = partial(2, sum)

  /**
   * Основная точка входа в программу.
   */
  def main(args: Array[String]): Unit = {
    // Пример использования частично применённой функции
    println(s"sumPartial(3) = ${sumPartial(3)}")  // Ожидается 5

    // Дополнительные примеры для проверки
    println(s"partial(10, sum)(7) = ${partial(10, sum)(7)}")  // Ожидается 17

    // Пример с конкатенацией строк
    val greet = partial("Hello, ", (a: String, b: String) => a + b)
    println(s"greet(\"world!\") = ${greet("world!")}")  // Ожидается "Hello, world!"
  }
}