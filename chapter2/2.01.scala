
/* 1: The signum of a number is 1 if the number is positive, -1 if it is negative, and 0 if it is zero. Write a function that computes this value. */

def signum(k: Int): Int = 
  if(k<0) -1 else if(k==0) 0 else 1

println(signum(-100))
println(signum(0))
println(signum(100))

