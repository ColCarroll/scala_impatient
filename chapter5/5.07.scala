
/* 7: Write a class Person with a primary constructor that accepts a string containing a first name, a space, and a last name, such as new Person("Fred Smith"). Supply read-only properties firstname and lastName. Should the primary constructor parameter be a var, a val, or a plain parameter? Why? */

class Person(name: String) {
  val Array(firstName, lastName) = name.trim.split(" ")
}

var me = new Person("David Cochran")
println(me.firstName)
println(me.lastName)

