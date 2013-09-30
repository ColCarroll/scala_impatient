
/* 1: Set up a map of prices for a number of gizmos that you covet. Then produce a second map with the same keys and the prices at a 10 percent discount */

val gizmos = Map("DT770" -> 250, "S40" -> 10000)
println(gizmos)

val discount_gizmos = for((g,p) <- gizmos) yield (g, p*.9)
println(discount_gizmos)

