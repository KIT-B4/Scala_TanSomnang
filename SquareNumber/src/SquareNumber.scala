

object SquareNumber {
  def main(args: Array[String])
  {
    
      
      var sq= (n:Int) => n*n
      println("Square: "+sq(5))
      
      var sq2=(n2:Int) => n2*n2
      println("Square: "+sq2(3))
      
      var sum=(n:Int,n2:Int) => sq(n)+sq(n2)
      println("Sum of Square is: "+sum(5,3))
      
      
     
      var ex=true
       while(ex)
       {
          println("Please, enter a number: ")
          var input=scala.io.StdIn.readInt()
          var n3=scala.io.StdIn.readInt()
          
          var sq3=(n3:Int) => n3*n3
          
          if(input=>sq3)
          {
            println("Your answer is correct.")
            ex=false
          }
          
          else
          {
            println("Your answer is wrong.")
            ex=true
          }
         
         
       }
        
      
      
    }
    
  }
