class Cashier(name:String) extends Employee(name) {
  override def working(): Unit = {
    println("Свободная касса")
  }
}
