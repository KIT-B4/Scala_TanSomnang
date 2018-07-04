

object Matrix {
  def main(args: Array [String])
  {
    var mat1=Array.ofDim[Int](2,2)
    var mat2=Array.ofDim[Int](2,2)
    var sum=Array.ofDim[Int](2,2)
    
    mat1(0)(0)=8
    mat1(0)(1)=2
    mat1(1)(0)=4
    mat1(1)(1)=5
    
    mat2(0)(0)=7
    mat2(0)(1)=8
    mat2(1)(0)=9
    mat2(1)(1)=2
    
     
    for(i<-0 until 2)
    {
      for(j<-0 until 2)
      {
        sum(i)(j) = mat1(i)(j) + mat2(i)(j)
        
       
        if(i==1 && j==0)
        {
           print("\n")
        }
        
         print("["+sum(i)(j)+"] ")
          
      }
      
    }
    
    
    
  }
}