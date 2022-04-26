object appChord extends App{
  def equation(x:Double): Double={
    val y = Math.pow(x, 3) + 18 * x - 83
    return y
  }

  def solve(rateError: Double, prevX:Double, currentX:Double, nextX:Double = 0): Double ={
    val newX = currentX - equation(currentX)*(prevX - currentX)/(equation(prevX) - equation(currentX))
    if(Math.abs(newX - nextX) < rateError){
      return newX
    }
    return solve(rateError, currentX,nextX,newX)
  }
  print(solve(0.001,-10,10))
}
