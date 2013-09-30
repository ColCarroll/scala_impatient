
/* 5: Write a procedure countdown(n: Int) that prints the numbers from n to 0 */

def countdown(n: Int) = for(k <- Range(n,0,-1)) println(k)

countdown(10)

