
/* Write a for loop for computing the produce of the Unicode codes of all letters in a string. For example, the product of the characters in "Hello" is 825152896 */

val word = "Hello"
var product = 1

for(w <- word) product *= w
println(product)

