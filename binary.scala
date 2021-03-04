import scala.math
import scala.collection.mutable.ListBuffer
case class binary (bin : Int){

  object convert1{
    def BinToDec (b: Int) : Float = {
      var i : Int =0
      var d : Float= null
      while (b!=0){
        d+=Math.pow(b%10,i)
        i+=1
        b=b//10
      }
      return d
    }

    object convert2 {
      def DecToBin (d : Int ) : Int ={
        var r : Int =0
        var liste : ListBuffer[Int] = ListBuffer()
        while ( d>0){
          r= d %2
          liste+=r
          d=d//2
        }
        var b : Int =0
        var j : Int =0
        for (i <- 0 until liste.length){
          b+=liste(i)*Math.pow(2,j)
          j+=1
        }
        return b
      }
    }

  }

  object Test {
    def main( args: Array[String]): Unit = {
      println("This is the first test")
      return DecToBin(BinToDec(1011100))==1011100  && BinToDec(DecToBin(85961))==85961
    }
  }

}
