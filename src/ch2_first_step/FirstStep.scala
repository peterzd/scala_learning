package ch2_first_step

object FirstStep {

  //定义函数
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def main(args: Array[String]) {
    args.foreach(arg => println(arg)) // 在这里，arg是函数字面量(function literal)，而“=>”后面的是函数体
    
    //简单写法：
    args.foreach(println) //函数字面量只有一行语句并只带一个参数，则连指代参数都不需要。注意，这是一种偏函数的写法。
  }

}