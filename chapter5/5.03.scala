
/* Write a class Time with read-only properties hours and minutes and a method before(other: Time): Boolean that checks whether this time comes before the other. A Time object should be constructed as new Time(hrs, min) where hrs is in military format (between 0 and 23) */

class Time(private val hour: Int = 0, private val minute: Int = 0) {
  def before(other: Time): Boolean = 
    hour < other.hour || (hour == other.hour && minute < other.minute)
}

val sunrise = new Time(6,34)
val sunset = new Time(19,20)

println(sunrise.before(sunset))
println(sunset.before(sunrise))

