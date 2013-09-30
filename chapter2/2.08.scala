
/* Write a function product(s: String) that computes the product, as described in the preceding exercises. */

def product(s: String): Int = s.foldLeft(1)(_*_)

println(product("Hello"))

