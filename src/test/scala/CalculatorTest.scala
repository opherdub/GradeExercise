

import org.scalatest.FunSuite
import FileStuff._

class CalculatorTest extends FunSuite {

  test("testCalcStats") {

  }

  test("testCalculateAverageResults") {
    var result1:Result = new Result("test",10,1,10f)
    var result2:Result = new Result("test",20,2,10f)
    var resultList = List(result1,result2)

    assert (Calculator.calculateAverageResults(resultList).sum == 30)
    assert (Calculator.calculateAverageResults(resultList).count == 3)
    assert (Calculator.calculateAverageResults(resultList).average == 10)
  }


  test("testCalculateAverageResultsFromFile") {

    val file = new FileReader(Settings.filePath)
    assert (Calculator.calcStats(file).count == 11)
    assert (if ((Calculator.calcStats(file).average - 46.727272).abs < 0.00001) true else false)
  }


}


