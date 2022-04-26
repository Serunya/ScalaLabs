package Task2

trait output extends QueueType {
  def output(): Unit = {
    var temp = this
    var count = 1
    do {
      println(count + ": " + temp.data)
      count += 1
      temp = temp.next
    } while (temp != null)
  }
}
