
/* 4: Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order. */

import io.Source._

val words = fromFile("words.txt").getLines.toArray
val wordCounts = for(word <- words.distinct) yield (word, words.count(_ == word))
val sortedCounts = scala.collection.immutable.SortedMap(wordCounts.toArray:_*)

println(sortedCounts)

