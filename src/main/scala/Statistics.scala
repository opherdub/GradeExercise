package FileStuff


class Statistics {

  def calculateAverageResults (resultList:List[Result]):Result = {

    val sum:Int = resultList.map(_.sum).sum
    val count: Int = resultList.map(_.count).sum

    Result("all regions", sum, count, sum.toFloat/count)
  }


}


/*
  def calculateAverageResults_TEMP (resultList:List[Result]):Result = {

    var sum:Int = 0
    var count: Int = 0

    resultList.foreach {a => sum += a.sum
      count += a.count}

    val finalResult = Result("all regions", sum, count, sum.toFloat/count)
    finalResult
  }
 */