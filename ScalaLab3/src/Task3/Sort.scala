package Task3

trait Sort{
  def Sort(ls: List): List ={
    var temp = ls
    var count = 0
    while(temp != null){
      count += 1
      temp = temp.next
    }
    for(i <- 0 until count){
      for(j <- 0 until count - 1){
        if(ls(j).data > ls(j + 1).data){
          val t = ls(j).data
          ls(j).data = ls(j+1).data
          ls(j+1).data = t
        }
      }
    }
    ls
  }
}