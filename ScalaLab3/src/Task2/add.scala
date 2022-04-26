package Task2

trait add extends QueueType {
  def add(num: Int): Unit = {
    var temp = this
    while (temp.next != null) {
      temp = temp.next
    }
    temp.next = new Queue(num)
  }
}
