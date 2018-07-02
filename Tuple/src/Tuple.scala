

object Tuple {
  def main(args : Array[String])
  {
    var i=("hello",1,10.2f,34,"World")
    var sum:Float=0
    
    println(i)
//    var q=List(1,23,4)
//    q.foreach(sum+=_)
    
//      Manually Added
//    var sum=i._2+i._3+i._4 
//    print(sum)
    
    
    i.productIterator.foreach{
      case i : Int => sum = sum + i
      case f : Float => sum = sum + f
      case s : String =>
    }
    print("Sum of all integer and float: "+sum)

  }
}