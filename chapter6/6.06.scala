
/* 6: Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠. */

object PlayingCardSuit extends Enumeration {
  val Club = Value("\u2663") 
  val Diamond = Value("\u2666")
  val Heart = Value("\u2665")
  val Spade = Value("\u2660")
}
import PlayingCardSuit._

PlayingCardSuit.values foreach println 

/* 
NOTE: make sure your file encoding is UTF-8, or you'll get ?s instead of the symbols
davidc:~/.things/impatient $ JAVA_OPTS="-Dfile.encoding=UTF-8" scala 6.06.scala 
♣
♦
♥
♠
*/

