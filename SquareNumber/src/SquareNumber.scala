

object SquareNumber {
  def main(args: Array[String])
  {
    
      
      var sq= (n:Int) => n*n
      println("Square: "+sq(5))
      
      var sq2=(n2:Int) => n2*n2
      println("Square: "+sq2(3))
      
      var sum=(n:Int,n2:Int) => sq(n)+sq(n2)
      println("Sum of Square is: "+sum(5,3))
      
      
     
      println("Please, enter a number to convert it to square: ")
      var n3=scala.io.StdIn.readInt()
         
      var ex=true
       while(ex)
       {
          println("Please, enter a guessing number: ")
          var input=scala.io.StdIn.readInt()
          
          
          var sq3=(n3:Int) => n3*n3
          
          if(input==sq3(n3))
          {
            println("Your answer is correct.")
            ex=false
          }
          else if(input==sq3(n3)-1 || input==sq3(n3)+1)
          {
            println("Your answer is nearly correct. But it's ok.")
            ex=false
          }
          else
          {
            println("Your answer "+input+ " is wrong.")
            ex=true
          }
         
         
       }
  }
    
  }
