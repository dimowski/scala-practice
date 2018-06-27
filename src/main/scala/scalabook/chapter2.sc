import java.util.function.IntToLongFunction

import scala.collection.mutable.ArrayBuffer

def signum(x: Double): Int = if (x == 0) 0 else if (x < 0) -1 else 1

signum(0)

var y: Int = 0
var x: Unit = y = 1

def cuntdown(n: Int) {
  for (i <- n to 0 by -1) println(i)
}

cuntdown(20)

def charMultiplier(str: String): Long = {
  var result: Long = 1
  for (c <- str) result = result * c
  result
}
charMultiplier("Hello")

def charMultiplier2(str: String): Long = {
  //str.chars().mapToLong(_.toLong).reduce(_*_).orElse(0)
  if (str.isEmpty) 1 else str.head * charMultiplier2(str.tail)
}

charMultiplier2("Hello")

val a = ArrayBuffer(1,5,72,2,-3)

print(a.sorted.toString())
