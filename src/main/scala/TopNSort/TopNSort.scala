package TopNSort

import MergeSort.MergeSort

object TopNSort {

  def topn(arr: Array[Int], n: Int): Array[Int] = {

    val resultTopN = Array[Int](10)

    val narr = arr.sortWith(_ < _)
    narr.slice(0, n)
//    var i = 0;
//    while (i < arr.length) {
//      if
//      arr(i)
//      i += 1
//    }

  }

  def main(args: Array[String]): Unit = {
    val arr = MergeSort.randomIntArray(100, 0, 1000)
    val n = 10
    val res = topn(arr, n)
    println(res.mkString(","))
  }

}
