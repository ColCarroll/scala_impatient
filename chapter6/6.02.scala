
/* 2: The preceding problem wasn't very object-oriented. Provide a general super-class UnitConversion and defined objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it */

class UnitConversion(multiplier: Double = 1.0) {
  def convert(value: Double): Double = value*multiplier
}

object InchesToCentimeters extends UnitConversion(2.54) {}
object GallonsToLiters extends UnitConversion(3.78541) {}
object MilesToKilometers extends UnitConversion(1.60934) {}

println(InchesToCentimeters.convert(1))
println(GallonsToLiters.convert(2))
println(MilesToKilometers.convert(100))

