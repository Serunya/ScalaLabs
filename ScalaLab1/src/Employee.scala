import scala.util.Random

class Employee(name:String) extends Human(name) {
  var salary = 300
  var money = 0

  def working(): Unit ={
    this.stamina -= 1
    this.money += salary
  }

  override def say_hello(): Unit = {
    super.say_hello()
    println("У меня " + money + " денег")
  }
  def relax(): Unit ={
    this.money -= Random.nextInt(money)
    this.stamina += Random.nextInt(50)
  }

  override def mood(): Unit = {
    println(money)
  }
}
