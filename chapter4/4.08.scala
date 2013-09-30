
/* 8: Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest values in the array. */

def minmax(values: Array[Int]): Tuple2[Int,Int] = (values.min, values.max)

val a = Array(1,2,3,4,5)
println(minmax(a))

