

object ListSearching {
  def main(args: Array[String])
  {
    //print only name that starts with 'A'
    val list=Vector("Hola","Ammy","Alex","Aloha", "Bob","John")
    
    
   
   for(name<-list if name.startsWith("A"))
   
      println(name)
    
    
    
  }
}