
/* 4: Given an array of integers, produce a new array that contains all positive values of the original array, in their original order, followed by all values that are zero or negative, in their original order. */

val a = Array(-1,-3,5,0,15,1,-7,8)
val b = a.filter(k => k<0) ++ a.filter(k => k>=0)

