class WorkingPlace {
  private var enum: Employee = null
  var table = true
  var chair = true
  var computer = true

  def set_employer(employee: Employee): Unit ={
    `enum` = employee
  }

  def get_employer(): Unit = {
    println("Здесь работает " + `enum`.Name)
  }
}
