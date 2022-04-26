object penultimate extends App{

  def penultimate(ls:List[String]){
    var count = 0
    for (i <- ls){
      count +=1
    }
    println("предпослдений Элемент найденный с помощью цикла: " + ls(count-2))
  }

  def penultimateR(ls:List[String]): Unit ={
    if(ls.size != 2){
      penultimateR(ls.tail)
    }
    else{
      println("предпослдений Элемент найденный с помощью рекурсии: "+ ls(0))
    }
  }

  println("Для нахождения последнего элемента списка введите: Last")

  var element: String = "";
  var ls: List[String] = List();

  do {
    element = scala.io.StdIn.readLine("Введите элемент списка:")
    if(element != "Last") ls = ls :+ element;
  }while(element != "Last")
  penultimate(ls)
  penultimateR(ls)
}

