class Staff(employee: Employee) {
  var list_employers: List[Employee] = List(employee)

  def add_employer(employee:Employee): Unit ={
    list_employers = list_employers.appended(employee)
  }

  def work(): Unit ={
    println("Работают " + list_employers.length + " сотрудника")
  }
}
