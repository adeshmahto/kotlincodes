fun main(){
    Myclass.f()

}

class Myclass{
    companion object Myobject{                         // companion keyword
        fun f(){
            println("i am object inside class")
        }
    }


}