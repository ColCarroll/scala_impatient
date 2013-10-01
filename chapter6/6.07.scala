
/* Implement a function that checks whether a card suit value from the preceding exercise is red. */

object PlayingCardSuit extends Enumeration {
  type PlayingCardSuit = Value
  val Club = Value("\u2663") 
  val Diamond = Value("\u2666")
  val Heart = Value("\u2665")
  val Spade = Value("\u2660")
}
import PlayingCardSuit._

def cardColor(s: PlayingCardSuit) = {
  if(s == Club || s == Spade) "black"
  else "red"
}

for(s <- PlayingCardSuit.values) println(cardColor(s))

