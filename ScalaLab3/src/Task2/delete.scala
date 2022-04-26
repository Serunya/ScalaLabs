package Task2

trait delete extends QueueType {

  def delete(): Unit = {
    this.data = this.next.data
    this.next = this.next.next
  }
}
