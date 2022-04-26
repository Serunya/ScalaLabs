class Librarian(name:String) extends Human(name) {

  def read_book(): Unit = {
    println("nice book")
  }

  override def say_hello(): Unit = {
    println("Hush!")
  }
}
