object VowelAndConsonant {
  def main(args: Array[String]){
  print("Please, input a string: ")
  var input=scala.io.StdIn.readLine();
  var i=0
  var j=0
  input =input.toLowerCase()
  
  for(i<- 0 to input.length)
  {
      var ch=input.charAt(i)
      
    if((ch=='a')|| (ch=='e')||(ch== 'i')||(ch=='o')||(ch== 'u'))
    {
      j=j+1;
    }
    else if((ch>='a')&&(ch<='z'))
    {
      println("Consonant: "+ch)
    }
  }
  print("Number of Vowel: "+j);
}
}