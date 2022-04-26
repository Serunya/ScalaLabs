trait math {
  var data: Int
  def +(num: Integer): Integer ={
    val sum = this.data + num.data
    Integer(sum)
  }
  def -(num: Integer): Integer ={
    val sum = this.data - num.data
    Integer(sum)
  }
  def *(num: Integer): Integer ={
    val sum = this.data * num.data
    Integer(sum)
  }
  def /(num: Integer): Integer = {
    val sum = this.data / num.data
    Integer(sum)
  }

  def abs(): Integer = Integer(this.data match {
    case 0 => 0
    case _ if this.data < 0 => this.data * -1
    case _ => this.data
  })
}
