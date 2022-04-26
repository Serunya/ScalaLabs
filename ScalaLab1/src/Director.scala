class Director(name:String) extends Employee(name) {
  def manage(): Unit = {
    println("Я рукововжу")
  }
}
