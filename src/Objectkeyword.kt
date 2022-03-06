class Objectkeyword {
}


fun main(){
    println(A1.num)
    B1.test1()
}

object A1{
    val num:Int=10
}
object B1{
    val p:Int=20
    fun test1(){
        println("I am object B")
    }
}
