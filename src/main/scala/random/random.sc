def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > acc) 0
    else f(a) + loop(a + 1, acc)
  }
  loop(a, b)
}

sum(x => x * x)(1, 3)
