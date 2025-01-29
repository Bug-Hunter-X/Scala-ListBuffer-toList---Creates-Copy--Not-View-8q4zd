```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Incorrect way to convert to an immutable List
  val immutableList = buffer.toList // This creates a copy, not a view

  buffer += 4

  println(immutableList) //This will still print List(1,2,3)
  println(buffer.toList) // This will print List(1,2,3,4)
}
```