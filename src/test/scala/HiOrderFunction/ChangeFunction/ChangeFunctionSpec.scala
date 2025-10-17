package HiOrderFunction.ChangeFunction

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

/**
 * Тесты для функции partial и связанных примеров.
 */
class ChangeFunctionSpec extends AnyFlatSpec with Matchers {

  "Функция partial" should "корректно работать со сложением" in {
    val sum = (a: Int, b: Int) => a + b
    val addTwo = ChangeFunction.partial(2, sum)
    addTwo(3) shouldEqual 5
    addTwo(10) shouldEqual 12
  }

  it should "работать с конкатенацией строк" in {
    val concat = (a: String, b: String) => a + b
    val greet = ChangeFunction.partial("Hello, ", concat)
    greet("world!") shouldEqual "Hello, world!"
  }

  it should "поддерживать произвольные типы" in {
    val multiply = (a: Double, b: Double) => a * b
    val doubleByThree = ChangeFunction.partial(3.0, multiply)
    doubleByThree(4.0) shouldEqual 12.0
  }

  "Функция sumPartial" should "возвращать правильный результат" in {
    ChangeFunction.sumPartial(3) shouldEqual 5
    ChangeFunction.sumPartial(0) shouldEqual 2
  }

  "Пример из main" should "выполняться корректно" in {
    val result1 = ChangeFunction.partial(10, ChangeFunction.sum)(7)
    result1 shouldEqual 17

    val greet = ChangeFunction.partial("Hello, ", (a: String, b: String) => a + b)
    greet("world!") shouldEqual "Hello, world!"
  }
}
