package FileStuff

// a class defining a histogram object and operations on it
class Histogram (size: Int) {

  var histogram = Array.fill[Int](size+1)(0)

  def calcHistogram(grades: List[Int]) = {
    grades.foreach(a => if (a >= 0 && a <= size) histogram(a) += 1)
  }

  //recieve a historgram object and add its' data to the current object
  def add(hist: Histogram): Unit = {
    for (i <- 0 to histogram.length - 1) {
      histogram(i) = histogram(i) + hist.histogram(i)
    }
  }

  def print() = {
    for (i <- 0 to histogram.length - 1) {
      println("[" + i + "] = " + histogram(i));
    }
  }
}
