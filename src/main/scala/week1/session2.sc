def fact(x: Int): Int = {
  if (x == 0) 1 else x * fact(x - 1)
}

def tailFac(x: Int, ret: Int): Int = {
  if (x == 0) ret else tailFac(x - 1, x * ret)
}

def sum(args: Int*): Int = {
  var s = 0
  for(i <- args) s += i
  s
}

sum(1 to 10: _*)

tailFac(9, 1)