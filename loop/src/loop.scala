object loop 
{
  def main(args:Array[String])
  {
    print("Please, enter your age: ")
    var n:Int =scala.io.StdIn.readInt() 
    for(i <-0 to n if i%4!=0)
    {
      println(i)
    }
  }
  
}