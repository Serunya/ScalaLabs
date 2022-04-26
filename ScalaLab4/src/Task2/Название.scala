package Task2

class Название {
  def W(w: Double): Double = w match {
    case 0 => 1
    if(1 / math.tan(w) < 0.5){
      case _ => w * -1
    }else{
      case _ => w
    }
  }
}
