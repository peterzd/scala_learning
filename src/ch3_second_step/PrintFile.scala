package ch3_second_step
import scala.io.Source

object PrintFile {

  def main(args: Array[String]) {

    def widthOfLength(s: String) = s.length().toString().length()

    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines.toList

      val longestLine = lines.reduceLeft((a, b) => if (a.length() > b.length()) a else b)

      val maxWidth = widthOfLength(longestLine)

      for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        print(padding + line.length() + " | " + line)
      }
    }
    else
      println("Please enter filename ")
  }

}