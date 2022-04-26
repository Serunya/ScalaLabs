object TargetTest1 extends App {
  def each(mas: Array[Int]): Unit = if (pos < mas.length) {
      print(mas(pos))
      pos += 1
    } else {
      pos = 0
      each(mas)
    }

  var pos = 0;
  val mas:Array[Int] = Array(5,4,3,2,1)
  each(mas)
  each(mas)
  each(mas)
  each(mas)
  each(mas)
  each(mas)
}