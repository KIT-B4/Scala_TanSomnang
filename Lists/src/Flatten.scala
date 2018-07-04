object Flatten 
{
  def main(args: Array[String])
  {
    
    var CategoryList=List(4,5,6)
    var BookList= List(1,2,3)
    var PageList= List(7,8,9)
    var LineList= List(10,11,12)
    
    
    var LibraryList= List(CategoryList,BookList, PageList, LineList).flatten    //List of list
    
    println(LibraryList)   //Flatten the list 
    
    var(x,y) = LibraryList.splitAt(11)
    
    println(y)    //Print only the last index
    
    
   
  }
}

