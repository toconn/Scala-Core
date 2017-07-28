package ua.core.comp


class Meter {
  
  var opCount = 0l
  private var isStarted = false
  private var startTimeMilliseconds = 0l
  private var cumulativeTimeMilliseconds = 0l    // Incremental over starts and stops.
  
  reset()
  start()
  
  def durationInMilliseconds: Long = {
    this.cumulativeTimeMilliseconds
  }
  
  def durationInSeconds: Float = {
    this.cumulativeTimeMilliseconds.toFloat / 1000
  }
  
  def incrementOpCounter(): Unit = {
    this.opCount += 1
  }
  
  def opsPerSecond: Float = {
    this.opCount.toFloat / durationInSeconds
  }
  
  def reset(): Unit = {
    
    this.startTimeMilliseconds = 0l
    this.cumulativeTimeMilliseconds = 0l
    
    this.isStarted = false
  }
  
  def start(): Unit = {
    
    if (! this.isStarted) {
      this.startTimeMilliseconds = System.currentTimeMillis()
      this.isStarted = true
    }
  }
  
  def stop(): Unit = {
    
    if (this.isStarted) {
      
      val stopTimeMilliseconds = System.currentTimeMillis()
      this.cumulativeTimeMilliseconds += stopTimeMilliseconds - this.startTimeMilliseconds

      this.isStarted = false      
    }
    
  }
  
}

