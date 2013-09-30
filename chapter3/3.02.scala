
/* 2: Write a loop that swaps adjacent elements of an array of integers. For example, Array(1,2,3,4,5) becomes Array(2,1,4,3,5) */

val a = Array(1,2,3,4,5)
val b = for(i <- a.indices) yield {
  if(i==a.length-1 && a.length%2==1) a(i)
  else if(i%2==0) a(i+1)
  else a(i-1)
}

println(b)

