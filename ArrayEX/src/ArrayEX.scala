

object ArrayEX {
  def main(args: Array[String])
  {

    var array =Array(5,10,15,20,25)
    var array1 = Array(5,10,75,20,25)
    var sum=0
    var sum1=0
    var array2 =Array.concat(array,array1)
    var max=array1.max
    
    for(i<-0 to 4)
    {
      sum=sum+array(i)
      
      
       print("["+array(i)+"] ")
     
      
    }
    print("\n")
    for(j<-0 to 4)
    {
      sum1=sum1+array1(j)
      print("["+array1(j)+"] ")
    }
    
   
    
   
    println("\nThe sum of array: "+sum)
    println("The sum of  second array: "+sum1)
    println("The max_number inside second array:  "+max)
    println("The concatenation of 2 arrays: ")
    array2.foreach(array2=>(print("["+array2+"] ")))
    
    
  }
}