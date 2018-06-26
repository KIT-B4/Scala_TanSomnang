object GreatestNumber {
   def main(args: Array[String])
   {
      println("The input must be between 0-99")
      print("Please input first number: ")
      var a=scala.io.StdIn.readLine();
      print("Please input second number: ")
      var b=scala.io.StdIn.readLine();
      print("Please input third number: ")
      var c=scala.io.StdIn.readLine();
      
  
     if((a>b)&&(a>c))
     {
       println(a+" is the biggest")
     }
     else if ((b>a)&&(b>c))
     {
       println(b+" is the biggest")
     }
     else if ((c>a)&&(c>b))
     {
       println(c+" is the biggest")
     }
     else
     {
       println(a+" "+b+" "+c+" "+" are equal")
     }
   }
  
}