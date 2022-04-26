object Length extends App{
  def Len(ls:List[String]): Unit ={
    var count = 0
    for (i <- ls){
      count +=1
    }
    println("Размер списка: " + count)
  }
  def LenR(ls:List[String],count:Int = 0): Unit ={
    if(ls.isEmpty){
      println("Размер списка (рек)" + count)
    }
    else{
      LenR(ls.tail, count + 1)
    }
  }

  println("Для нахождения последнего элемента списка введите: Last")

  var element: String = "";
  var ls: List[String] = List();

  do {
    element = scala.io.StdIn.readLine("Введите элемент списка:")
    if (element != "Last") ls = ls :+ element;
  } while (element != "Last")

  Len(ls)
  LenR(ls)

}
