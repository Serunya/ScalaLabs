package Task1

class IntPower(var num: Double) extends Pow{
  override def toSecond(): Double = {
    num = Math.pow(num,2)
    num
  }
  override def toThird(): Double ={
    num = Math.pow(num,3)
    num
  }
  override def toFourth(): Double ={
    num = Math.pow(num,4)
    num
  }
  override def toFifth(): Double ={
    num = Math.pow(num,5)
    num
  }
}
