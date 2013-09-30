
/* 6: How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order? How do you do the same with an ArrayBuffer[Int]? */

import util._

val a = Array(1,2,6,-1,10,32,3)
Sorting.quickSort(a)
a.reverse

// convert ArrayBuffer[Int] .toArray and do the same

