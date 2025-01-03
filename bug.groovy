def myMethod() {
  def list = [1, 2, 3, 4, 5]
  list.eachWithIndex { element, index ->
    if (element == 3) {
      list.remove(element)
    }
  }
  println list
}

myMethod() //Output: [1, 2, 4, 5]