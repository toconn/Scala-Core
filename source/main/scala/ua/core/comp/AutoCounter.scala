package ua.core.comp

class AutoCounter {
  
  var value = 0l
  
  def next(): Long = {
    
    this.value += 1l
    this.value
  }
}