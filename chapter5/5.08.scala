
/* 8: Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property for the license plate. Supply four constructors. All require the manufacturer and the model name. Optionally, model year and license plate can also be specified in the constructor. If not, the model year is set to -1 and the license plate to the empty string. Which constructor are you choose as the primary constructor? Why? */

/* Disobeying directions, we can do this in one line with one [primary] constructor. */
class Car(val make: String, val model: String, val year: Int = -1, var plate: String = "") { }

var mine = new Car("VW", "Golf", 1998, "MYWHIPP")
println(mine.make)
println(mine.model)
println(mine.year)
println(mine.plate)

var yours = new Car("Volvo", "S40")
println(yours.make)
println(yours.model)
println(yours.year)
println(yours.plate)


