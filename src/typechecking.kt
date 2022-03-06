class typechecking {
}

fun main(){
    val rectangle=rectange4(3.5,6.7)
    val player=player("adesh")

//    if(rectangle is rectange4){    // type checking
//        println("yes it is ")
//    }else{
//        println("No it is not")
//    }
//
    val arr= arrayOf(rectange4(3.4,6.8),player("Adesh"))
    for(obj in arr){
        if(obj is  rectange4){
            println( obj.area())
        }else{
            (obj as player).sayMyname()
        }
    }
}




interface Draggable{
    fun drag()
}
abstract class Shape4:Draggable{
    abstract fun area():Double

}
class rectange4(val l:Double,val b:Double):Shape4() {
    override fun area() = l * b
    override fun drag() {
        println("rectangle is dragging")
    }
}
class player(val name:String):Draggable{
    override fun drag() {
        println("$name is dragging")
    }
    fun sayMyname()= println("hey my name is $name")
}