def myMethod() {
  def list = [1, 2, 3, 4, 5]
  def iterator = list.iterator()
  while (iterator.hasNext()) {
    def element = iterator.next()
    if (element == 3) {
      iterator.remove()
    }
  }
  println list
}

myMethod() //Output: [1, 2, 4, 5]