package FileStuff


object Main {


  def main(args: Array[String]): Unit = {

    val dir = new FileList(Settings.path, Settings.filePrefix)              //get list of files to work on. Filter for files with filePrefix only
    val files = dir.files  //list of files to work on

    val dataFiles = files.map(file => new FileReader(file.toString)).sortBy(_.filePath)   //create list of processed data objects, one for each file
    val resultsList = dataFiles.map(data => Calculator.calcStats(data))     //extract results for each data object

    val stats = Calculator.calculateAverageResults(resultsList)             //calculate statistics accross all data objects
    var finalHistogram = new Histogram(100)                                //calculate histrogram across the whole dataset
    dataFiles.foreach(file => finalHistogram.calcHistogram(file.grades))


    // #### print results ####
    // ####---------------####
    println("Fun Stuff")

    println("\nthe calculator results are:")
    resultsList.foreach(a => println(a))

    println("\nthe final results are: " + stats)

    println("\nfinal histogram is:")
    finalHistogram.print()

  }
}