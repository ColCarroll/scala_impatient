
/* 3: Repeat the preceding exercise with an immutable map. */

import io.Source._

val words = fromFile("words.txt").getLines.toArray
val wordCounts = for(word <- words.distinct) yield (word, words.count(_ == word))

println(wordCounts.toMap)

