object insertAt extends App{
  def insert(ins:String, i:Int, lsR:List[String]): Unit ={
    var ls:List[String] = lsR
    for(j <- 0 until ls.size){
      if(j == i){
        val (start, end) = ls.splitAt(j)
        ls = start ++ List(ins) ++ end
      }
    }
    println(ls)
  }

  def insertR(ins:String, i:Int, lsR:List[String], count:Int = 0): Unit ={
    if(count == i){
      var ls:List[String] = lsR
      val (start, end) = ls.splitAt(i)
      ls = start ++ List(ins) ++ end
      println(ls)
    }
    else{
      insertR(ins,i,lsR, count + 1)
    }
  }

  println("Для нахождения последнего элемента списка введите: Last")

  var element: String = "";
  var ls: List[String] = List();

  do {
    element = scala.io.StdIn.readLine("Введите элемент списка:")
    if (element != "Last") ls = ls :+ element;
  } while (element != "Last")
  var ins: String = scala.io.StdIn.readLine("Введите элемент: ")
  print("Введите позицию: ")
  var i:Int = scala.io.StdIn.readInt()
  insert(ins,i - 1,ls)
  insertR(ins,i - 1,ls)
}
