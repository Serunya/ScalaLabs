package Task3

class List(val num: Int) extends sum with mul with average with Sort {
  var data : Int = num
  var next: List = null
  var prev: List = null
  override def +(ls: List): List = {
    var temp = this
    while(temp.next != null){
      temp = temp.next
    }
    temp.next = ls
    ls.prev = temp
    this
  }
  def apply(num: Int): List ={
    var temp = this
    var i = num
    while(i != 0){
      i -= 1;
      temp = temp.next
    }
    temp
  }
  override def *(ls: List): List = {
    var temp = this
    var t = ls
    while(temp.prev != null){
      temp = temp.prev
    }
    while (t != null){
      while(temp != null){
        temp.data = temp.data * t.data
        temp = temp.next
      }
      temp = this
      t = t.next
    }
    this
  }
  def apply(): String ={
    var mainStr: String = "List( "
    var temp = this
      do{
        mainStr = mainStr + temp.data + " "
        temp = temp.next
      }while(temp != null)
    mainStr + ")\n"
  }

  override def average(): Int = {
    var count = 0
    var sum = 0
    var temp = this
    while(temp != null){
      sum += temp.data
      count += 1
      temp = temp.next
    }
    sum / count
  }
}

