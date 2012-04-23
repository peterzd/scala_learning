package chapter6

class Rational(n : Int , d : Int) {
  require(d != 0)
  
  private val g = gcd(n.abs , d.abs)
  val number : Int = n / g 
  val denom : Int = d / g

  override def toString = number + "/" + denom;
  
  def +(that : Rational) : Rational = 
    new Rational(
	  number * that.denom + that.number * denom,
	  denom * that.denom    
    )
  
  def +(i:Int) : Rational = 
    new Rational(number + i * denom , denom)
  
  def -(that : Rational) : Rational = 
    new Rational(number * that.denom - that.number * denom , 
        denom * that.denom)
  
  def - (i : Int) : Rational =
    new Rational(number - i* denom , denom)
  
  def *(that:Rational) : Rational = 
    new Rational(number * that.number , denom * that.denom)
  
  def *(i : Int) : Rational =
    new Rational(number * i , denom)
  
  def /(that : Rational) : Rational =
    new Rational(number * that.denom , denom * that.number)
  
  def /(i : Int) : Rational =
    new Rational(number , denom * i)
  
  /**
   * 求公约数
   */
  private def gcd(a : Int , b : Int) : Int = 
    if ( b == 0) a else gcd(b , a % b)

}