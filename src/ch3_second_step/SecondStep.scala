package ch3_second_step

object SecondStep {

  def main(args: Array[String]) {

    //greetStrings 的类型是Array[String]
    val greetStrings = new Array[String](3)

    greetStrings(0) = "hello "
    greetStrings(1) = " , "
    greetStrings(2) = "world "

    for (i <- 0 to 2)
      print(greetStrings(i))
  }

}