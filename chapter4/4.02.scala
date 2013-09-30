
/* 2: Write a program that reads words from a file. Use a mutable map to count how often each word appears */

import io.Source._

val lines = fromFile("words.txt").getLines
var words = new scala.collection.mutable.HashMap[String, Int]

for(word <- lines) {
  if(words.contains(word)) words(word) += 1
  else words(word) = 1
}

println(words) 

