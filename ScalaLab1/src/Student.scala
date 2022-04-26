import java.util.Random

class Student{//не наследуюсь
  var time = 25
  var stamina = 200
  var mood = 100
  def go_univerity(): Unit ={
    time -= 8
    val rand = new Random();
    mood += rand.nextInt(-20,20)
  }
  def study(): Unit ={
    mood -= 10
    val rand = new Random()
    time -= rand.nextInt(8)
  }

  def sleep(): Unit ={
    time = 25
  }
}
