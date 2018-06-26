object highToLow 
{
  def main(args: Array[String])
  {
    print("Please, Enter any number: ")
    var input=scala.io.StdIn.readInt()
    
    println(input)
    while(input!=0)
    {
      input=input-1;
      println(input)
      if(input==0)
      {
        println("Happy Birthday!!!")
      }
    }
  }
}