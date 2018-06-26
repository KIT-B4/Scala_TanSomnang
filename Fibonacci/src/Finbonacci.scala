object Finbonacci 
{
  def main(args: Array[String]) :Unit={ 
   Fibonacci(6); 
  }
  

  def Fibonacci( n : Int ) : Int = {
 
  var a = 1
  var b = 0
  var i = 0	  
 
  while( i < n )
  {
    val c = a + b
    a = b
    b = c
    i = i + 1
    print (c+" ");
  } 
  return a
}
}
