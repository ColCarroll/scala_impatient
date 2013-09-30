
/* 9: Make the function of the preceding exercise a recursive function. */

def product(s: String): Int = {
  if(s.length > 0) s.head*product(s.tail)
  else 1
}

println(product("Hello"))

