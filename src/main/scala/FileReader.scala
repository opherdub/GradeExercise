package FileStuff
import scala.io.Source


//get fileName and extract grades (THE data) from it
class FileReader (fileName: String) {

  val filePath:String = fileName
  val shortName:String = fileName.slice(filePath.indexOf("region-"), filePath.length())
  val grades = extractGrades()

  private def readFile(): List[String] = {
    val lines = Source.fromFile(fileName).getLines.toList.filter(!_.startsWith("a"))
    lines
  }

  private def extractGrades(): List[Int] = {
    val lines = readFile()
    val grades = lines.map(line => line.split(",")).collect {
      case Array(id, grade) => grade.toInt
    }
    grades
  }
}