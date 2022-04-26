package Task3

object Task3 extends App{
  var l1 = new List(8)
  l1 = l1 + new List(5)
  l1 = l1 + new List(6) + new List(2)
  print(l1())
  l1.Sort(l1)
  println(l1())
}