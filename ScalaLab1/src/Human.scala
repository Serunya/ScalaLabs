class Human(name: String) {
  var Name:String = name
  var stamina = 100
  def say_hello(): Unit ={
    println("Hello, my name " + Name)
  }



  def mood(): Unit ={
    print(stamina)
  }
}
