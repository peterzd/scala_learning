package chapter9
import java.io.File

object FileMatcher {
  private def filesHere = (new File(".")).listFiles
  
  def filesMatching(matcher : String => Boolean) = {
      for ( file <- filesHere ; if matcher(file.getName))
        yield file
    }
  
  def filesEnding(query:String) = 
    filesMatching(_.endsWith(query)) //_的作用与以下是一回事：(fileName:String , query : String) => fileName.endsWith(query)
  
  def filesContaining(query:String) = 
    filesMatching( _.contains(query))
  
  def filesRegex(query : String ) =
    filesMatching( _.matches(query))
}