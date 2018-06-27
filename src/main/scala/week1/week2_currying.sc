def product(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 1
  else f(a) * product(f)(a + 1, b)
}
product(x => x * x) (3, 4)

def fact(n : Int) = product(x => x)(1, n)
fact(3)

def generic()


case class Test(test: String)

val frankenstein = Test("978-0486282114")

println(frankenstein)