package FileStuff

//calculates grade statistics for a data file of type fileReader
object Calculator {

  def calcStats(dataFile:FileReader) = {
    val sum = dataFile.grades.reduce((a,b) => a + b)
    val studentCount = dataFile.grades.count(c => true)
    val gradeAverage : Float = sum.toFloat / studentCount.toFloat
    val stats = Result(dataFile.shortName, sum, studentCount, gradeAverage)
    stats
  }
}


