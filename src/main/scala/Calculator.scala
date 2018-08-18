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

  def calculateAverageResults (resultList:List[Result]):Result = {

    val sum:Int = resultList.map(_.sum).sum
    val count: Int = resultList.map(_.count).sum
    Result("all regions", sum, count, sum.toFloat/count)
  }


  def calcAverageGrade(grades:List[Int]):Float = {
    val sum = grades.reduce((a,b) => a + b)
    val studentCount = grades.count(c => true)
    val gradeAverage : Float = sum.toFloat / studentCount.toFloat
    gradeAverage
  }


}


