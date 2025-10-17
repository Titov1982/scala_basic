package Rational

import scala.annotation.tailrec
import scala.language.implicitConversions

object Rational {
  implicit def intToRational(i: Int): Rational = new Rational(i)
}

class Rational(n: Int, d: Int) {

  private val g = gcd(n.abs, d.abs)
  private val numer = n / g
  private val denom = d / g

  def this(n: Int) = this(n, 1)

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def + (that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }

  def + (i: Int): Rational = {
    new Rational(
      numer + i * denom,
      denom
    )
  }

  def - (that: Rational): Rational = {
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  }

  def - (i: Int): Rational = {
    new Rational(
      numer - i * denom,
      denom
    )
  }

  def * (that: Rational): Rational = {
    new Rational(
      numer * that.numer,
      denom * that.denom
    )
  }

  def * (i: Int): Unit = {
    new Rational(
      numer * i,
      denom
    )
  }

  def / (that: Rational): Rational = {
    new Rational(
      numer * that.denom,
      denom * that.numer
    )
  }

  def / (i: Int): Rational = {
    new Rational(
      numer,
      denom * i
    )
  }

  def < (that: Rational): Boolean = {
    numer * that.denom < that.numer * denom
  }

  def < (i: Int): Boolean = {
    numer < i * denom
  }

  def > (that: Rational): Boolean = {
    numer * that.denom > that.numer * denom
  }

  def > (i: Int): Boolean = {
    numer > i * denom
  }

  def max(that: Rational): Rational = {
    if (this > that) this else that
  }

  override def toString: String = {
    if (this.numer == 0) "0"
    else if (this.denom == this.numer) "1"
    else s"$numer/$denom"
  }



}
