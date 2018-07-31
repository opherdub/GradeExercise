import java.io.File

object count {

  val x = 2

  /* Declare a List[Int] and List[String] for use later */
  val list = 10::30::List(20)
  val stringList = "1"::"2"::List("3")

  /* Doesn't actually sort - just returns xs */
  def sortList[A](xs: List[A]): List[A] = xs

  /* Sort both lists */
  sortList(list)
  sortList(stringList)

  /* Create a version of sortListInt which just works on Ints */
  def sortListInt = sortList[Int] _

  /* Sort the List[Int] with the new function */
  sortListInt(list)

  /* fails to compile - sortListInt is a
  version of sortList which is only applicable to Int */
  def sortListString = sortList[String] _

  sortListString(stringList)



  val files = getListOfFiles("/Users/opher1/Documents/Code/Scala/InterviewTask/Files")




}

