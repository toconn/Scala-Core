package ua.core.utils

class First {
  
  var _isFirst = true
  
  def isFirst(): Boolean = {
    
    val isNowFirst = this._isFirst
    
    if (isNowFirst) {
      this._isFirst = false
    }
    
    isNowFirst
  }
  
  def isNotFirst(): Boolean = ! isFirst()

}
