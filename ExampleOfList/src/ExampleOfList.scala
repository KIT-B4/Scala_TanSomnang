object ExampleOfList 
{
    def main(args: Array[String])
  {
  
//     var fruit=List("apple","banana","pineapple","pear","orange");
//     
//     var x=fruit.slice(3,7)
//     println(fruit.tail)
//     var(l,r)=fruit.splitAt(3)
//     println(x)
//     println(l)
//     println(r)
//     println(fruit.reverse)
     
     var list1=List(12,34,45,67)
     var list2=List(23,46,78,32,43)
     
     var con=list1++list2
     println(con)
     
     println(con.reverse)
     
    
     for(i<-0 to con.length-1)
     { 
       if (con(i)%2!=0)
       println(con(i))
     }
     
  }
 
}