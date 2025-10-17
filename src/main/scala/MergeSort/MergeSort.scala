package MergeSort

import scala.util.Random

object MergeSort {
  private def merge(left: Array[Int], right: Array[Int]): Array[Int] = {
    if (left.isEmpty) {
      right
    } else if (right.isEmpty) {
      left
    } else {
      if (left.head < right.head) {
        Array(left.head) ++ merge(left.tail, right)
      } else {
        Array(right.head) ++ merge(left, right.tail)
      }
    }
  }

  def sort(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) {
      arr
    } else {
      val mid = arr.length / 2
      val left = sort(arr.slice(0, mid))
      val right = sort(arr.slice(mid, arr.length))
      MergeSort.merge(left, right)
    }
  }

  def randomIntArray(vectorSize: Int, lowerBound: Int, upperBound: Int): Array[Int] = {
    Array.fill(vectorSize) {lowerBound + Random.nextInt(upperBound - lowerBound)}
  }

  def main(args: Array[String]): Unit = {
//    val arr = Array(1, 5, 3, 2, 4)
    val vectorSize = 10;
    val lowerBound = 0;
    val upperBound = 20;
    val arr = randomIntArray(vectorSize, lowerBound, upperBound)
    printf(arr.mkString(",") + "\n")
    val sortedArr = MergeSort.sort(arr)
    println(sortedArr.mkString(",") + "\n")
  }

}
