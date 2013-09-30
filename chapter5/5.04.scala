
/* 4: Reimplement the Time class from the preceding exercise so that the internal representation is the number of minutes since midnight (between 0 and 24*60-1). Do not change the public interface. That is, client code should be unaffected by your change. */

class Time {
  private var minutes = 0

  def this(hour: Int, minute: Int) {
    this()
    this.minutes = hour*60 + minute
  }

  def before(other: Time): Boolean = 
    minutes < other.minutes
}

val sunrise = new Time(6,34)
val sunset = new Time(19,20)
println(sunrise.before(sunset))
println(sunset.before(sunrise))

