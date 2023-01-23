object Solution extends App {
  def f(n: Int): Unit = if (n > 0) {
    println("Hello World")
    f(n-1)
  }

  var n = scala.io.StdIn.readInt
  f(n)
}
