class Guard(name:String) extends Employee(name) {
  var health = 100
  override def working(): Unit ={
    println("Я защишаю")
  }
}
