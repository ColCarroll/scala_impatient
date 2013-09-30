
/* 9: Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values less than v, equal to v, and greater than v. */

def lteqgt(values: Array[Int], v: Int): Tuple3[Int,Int,Int] =
  (values.count(_<v), values.count(_==v), values.count(_>v))

val a = Array(1,2,3,4,5,6)
println(lteqgt(a, 3))

