package HiOrderFunction.ChangeFunction

import StepikScalaCourse.step2.step2_6_10
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class step2_6_10Spec extends AnyFlatSpec with Matchers {

  // Тестируем calcFuncRec
  "calcFuncRec" should "правильно вычислять результат" in {
    step2_6_10.calcFuncRec(10, 1, 5) shouldEqual 15
    step2_6_10.calcFuncRec(5, 3, 4) shouldEqual 17
    step2_6_10.calcFuncRec(0, 10, 3) shouldEqual 30
    step2_6_10.calcFuncRec(-5, 2, 3) shouldEqual 1
    step2_6_10.calcFuncRec(100, -10, 5) shouldEqual 50
  }

  // Тестируем printRec
  "printRec" should "правильно формировать строку" in {
    step2_6_10.printRec(15) shouldEqual "15 15 is the result"
    step2_6_10.printRec(99) shouldEqual "99 99 is the result"
    step2_6_10.printRec(0) shouldEqual "0 is the result"
    step2_6_10.printRec(5) shouldEqual "5 is the result"
    step2_6_10.printRec(-123) shouldEqual "-123 -123 -123 is the result"
  }

  // Проверка граничных значений
  it should "работать с максимальными значениями" in {
    val maxInt = Int.MaxValue
    step2_6_10.calcFuncRec(maxInt, 1, 1) shouldEqual maxInt + 1
    step2_6_10.printRec(maxInt) shouldEqual s"$maxInt $maxInt $maxInt $maxInt $maxInt $maxInt is the result"
  }
}
