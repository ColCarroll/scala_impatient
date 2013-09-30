
/* 7: Solve the preceding exercise without writing a loop */

val word = "Hello"
val product = word.foldLeft(1)(_*_)
// equivalently: val product = (1 /: word)(_*_) 

println(product)

