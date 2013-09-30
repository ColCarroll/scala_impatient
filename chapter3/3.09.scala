
/* 9: Make a collection of all timezones returned by java.util.TimeZone.getAvailableIDs that are in America. Strip off the "America/" prefix and sort the result. */

import util._

val timezones = java.util.TimeZone.getAvailableIDs
val americas = timezones.filter(k => k.contains("America")).map(k => k.split("/")(1))
Sorting.quickSort(americas)

