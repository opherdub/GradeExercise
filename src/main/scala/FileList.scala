package FileStuff

import java.io.File

class FileList (dirPath:String, prefix: String){

  val path = dirPath
  val filePrefix = prefix
  val files = getShortListOfFiles(path,filePrefix)

  // returns the list of files in the directory
  private def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }

  // returns a filtered list to work on
  private def getShortListOfFiles(dir: String, prefix: String):List[File] = {
    val shortList = getListOfFiles(dir).filter(_.getName().startsWith(prefix))
    shortList
  }


}
