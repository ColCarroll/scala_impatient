
/* 1: Write a Scala code snippet that reverses the lines in a file (making the last line the first one, and so on) */

for(l <- scala.io.Source.fromFile("lines.txt").getLines.toArray.reverse) println(l)

