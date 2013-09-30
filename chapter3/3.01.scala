
/* 1: Write a code snippet that sets a to any array of n random integers between 0 (inclusive) and n (exclusive) */

import util._

val n = 10
val a = for(i <- 0 until n) yield Random.nextInt(n)

println(a)

