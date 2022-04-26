object Lotto extends App{
  def lotto(size:Int, MaxR:Int): List[Int] = {
    var ls:List[Int] = List()
    val r = new scala.util.Random
    for(i <- 0 until size) {
      val rNumber = r.nextInt(MaxR);
      ls = ls :+ rNumber
    }
    return ls
  }
  def lottoR(size:Int , MaxR:Int  ): List[Int] ={
    var ls:List[Int] = List(scala.util.Random.nextInt(MaxR))
    if(size != 1){
    ls = ls ++ lottoR(size - 1, MaxR)
    }
    return ls
  }
  println(lotto(10, 60))
  print(lottoR(6,120))
}
