package FileStuff


object Main {


  def main(args: Array[String]): Unit = {

    //get list of files to work on. Filter for files with filePrefix only
    val dir = new FileList(Settings.path, Settings.filePrefix)
    val files = dir.files  //list of files to work on

    //create list of processed data objects, one for each file
    val dataFiles = files.map(file => new FileReader(file.toString)).sortBy(_.filePath)
    //extract results for each data object
    val resultsList = dataFiles.map(data => new Calculator(data).results)

    //calculate statistics accross all data objects
    val stats = new Statistics().calculateAverageResults(resultsList)

    //calculate histrogram across the whole dataset
    var finalHistogram = new Histogram(100)
    dataFiles.foreach(file => finalHistogram.calcHistogram(file.grades))


    // #######################
    // #### print results ####
    // #######################

    println("Fun Stuff")

    println("\nthe calculator results are:")
    resultsList.foreach(a => println(a))

    println("\nthe final results are: " + stats)

    println("\nfinal histogram is:")
    finalHistogram.print()

  }
}