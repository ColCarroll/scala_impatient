
/* 8: Write an enumeration describing the eight corners of the RGB color cube. As IDs, use the color values (for example, 0xff0000 for Red). */

object ColorCube extends Enumeration {
  val Black = Value(0x000000)
  val Red = Value(0xff0000)
  val Green = Value(0x00ff00)
  val Blue = Value(0x0000ff)
  val Yellow = Value(0xffff00)
  val Magenta = Value(0xff00ff)
  val Cyan = Value(0x00ffff)
  val White = Value(0xffffff)
}

