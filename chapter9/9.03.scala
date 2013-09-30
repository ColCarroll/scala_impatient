
/* 3: Write a Scala code snippet that reads a file and prints all words with more than 12 characters to the console. Extra credit if you can do this in a single line. */

import scala.io._
println(Source.fromFile("something.txt").mkString.split("\\s+").filter(_.length>12).mkString("\n"))

