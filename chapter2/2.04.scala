
/* 4: Write a Scala equivalent for the Java loop
  for(int i=10; i >= 0; i--) System.out.println(i);
*/

for(k <- Range(10,0,-1)) println(k)
// initial thought: for(k <- 0.to(10).reverse) println(k)

