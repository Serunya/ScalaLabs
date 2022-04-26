class Worker(name:String) extends Employee(name) {
  var time = 24;
  var work_time = 8

  def work(): Unit ={
    if (time > work_time){
      time -= work_time
      money += salary
      stamina -= work_time * 4
    }
  }

  override def relax(): Unit ={
    time = 24
    stamina += 24
  }

  override def mood(): Unit = {
    println(time)
  }
}
