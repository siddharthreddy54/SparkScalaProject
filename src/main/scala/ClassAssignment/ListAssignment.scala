package ClassAssignment

object ListAssignment {
def main(args: Array[String]): Unit={
  val words = List("spark","scala","training")
  println("The list of word: " +words)
 println("The Second element of List: "+words(1))
  val wordcount = words.count(x=>x.length==5)
  println("Number of element with length 5: "+wordcount)
  val wordDrop = words.drop(1)
  println(wordDrop)
  val wordRightDrop=words.dropRight(2)
  println(wordRightDrop)
  println("Does list contains spark: "+words.contains("spark"))
  val wordfilter = words.filter(x=>x.length==5)
  println("Element with length 4: "+words.head)
println("first element of list: "+words.head)
  println("List of elements except last element: "+words.init)
  println("Is list is empty: "+words.isEmpty)
  println("Last element of list: "+words.last)
  println("List with easy concatination: "+words.map(x=>x.concat("easy")))


}
}
