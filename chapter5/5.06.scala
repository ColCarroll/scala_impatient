
/* In the Person class of section 5.1, "Simple Classes and Parameterless Methods," on page 51, provide a primary constructor that turns negative ages to 0. */

/* ... meaning the Person class of section 5.7 ?? */

class Person(var age: Int) {
  /* "The primary constructor executes all statements in the class definition" */
  age = 0 max age
}

var me = new Person(15)
println(me.age)
var you = new Person(-15)
println(you.age)

