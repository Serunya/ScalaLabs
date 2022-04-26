import compress.ls

object compress extends App{
  var j:Int = 0
  def comp(SListS:List[String]): Unit = {
    var ls = SListS
    var i = 0
    while(i < ls.size - 1) {
      if(ls(i) == ls(i+1)) {
        val (h, t) = ls.splitAt(i)
        ls = h ++ t.tail
        i -= 1
      }
      i += 1
    }
  println(ls)
  }

  def compR(Cls:List[String], count:Int = 0): Unit ={
    var ls = Cls
    if(count == ls.size - 1){
      println(ls)
    }
    else{
      if(ls(count) == ls(count + 1)){
        val (h, t) = ls.splitAt(count)
        ls = h ++ t.tail
        compR(ls, count)
      }
      else{
        compR(ls, count + 1)
      }
    }
  }

  println("Для нахождения последнего элемента списка введите: Last")

  var element: String = "";
  var ls: List[String] = List();

  do {
    element = scala.io.StdIn.readLine("Введите элемент списка:")
    if(element != "Last") ls = ls :+ element;
  }while(element != "Last")
  comp(ls)
  compR(ls)
}
