
/* 5: Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated by spaces. For example, scala Reverse Hello World should print World Hello */

object Reverse extends App {
  println(args.reverse.mkString(" "))
}

/* 
david:~/.things/impatient $ scalac 6.5.scala 
david:~/.things/impatient $ scala Reverse test ok
ok test
/* 

