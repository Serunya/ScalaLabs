package Task2

class Queue(var num: Int) extends QueueType with add with delete with output {
    override var data: Int = num
    override var next: Queue = null
}