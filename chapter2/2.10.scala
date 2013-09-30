
/* 10: Write a function that computes x^n, where n is an integer. Use the following recursive definition:
  x^n = y^2 if n is even and positive, where y = x^{n/2}
  x^n = x*x^{n-1} if n is odd and positive
  x^0 = 1
  x^n = 1/x^{-n} if n is negative

Don't use a return statement */

def power(x: Double, n: Int): Double = {
  if(n>0 && n%2==0) power(x,n/2)*power(x,n/2)
  else if(n>0) x*power(x,n-1)
  else if(n==0) 1
  else 1/power(x,-n)
}

println(power(2,2))
println(power(2,3))
println(power(2,-1))

