```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Correct approach: Create a new List each time you need the current contents
  val immutableList1 = buffer.toList

  buffer += 4
  val immutableList2 = buffer.toList

  println(immutableList1) // Prints List(1, 2, 3)
  println(immutableList2) // Prints List(1, 2, 3, 4)
  //Alternative: Use a view
  // val view = buffer.view //This will create a view, but will not be a List
}
```