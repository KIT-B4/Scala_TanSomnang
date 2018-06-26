object ListOfList 
{
  def main(args: Array[String])
  {
    var li1=List(12,24,23,45,65)
    var li2=List(75,25,35,14,85,41)
    var li3=List(1,2,3,4,5,6,7)
    
    var con=li1++li2++li3
    println("Concatenate the 3 lists: "+con)
    
    var li4=List(li1,li2,li3)
    
    var convert=li4.mkString
 
    println("List of list: "+li4)
    println("Convert int to String: "+convert)
    
    println("Print all elements except the last one: 0"+con.init)
  }
  
 
}