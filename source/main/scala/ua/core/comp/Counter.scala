package ua.core.comp

class Counter {
  
  var value = 0l
  
  def increment(): Unit = {
    this.value += 1l
  }
}