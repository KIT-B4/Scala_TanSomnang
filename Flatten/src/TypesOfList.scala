object TypesOfList 
{
  def main(args: Array[String])
  {
    
    var CategoryList=List(4,5,6)
    var BookList= List(1,2,3)
    var PageList= List(7,8,9)
    var LineList= List(10,11,12)
    
    
    var LibraryList= List(CategoryList,BookList, PageList, LineList).flatten
    
    println(LibraryList)
    
    var(x,y) = LibraryList.splitAt(11)
    
    println(y)
    
  }
}

