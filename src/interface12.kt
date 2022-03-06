import java.util.*


fun main(){
    dragObject(arrayOf(Circle3(3.4),rectange3(2.0,4.0)))
}
fun dragObject(objects: Array<dragonit>){
    for(ob in objects){
        ob.dragon()
    }
}
interface dragonit{
    fun dragon()          // abstract methode
}
interface cloneable{
    fun clone()
}
abstract class Shape3:dragonit,cloneable{
    abstract fun area():Double
    abstract fun drag()
}
class Circle3(val radius:Double):Shape3() {

    override fun area():Double{
        return Math.PI*radius*radius
    }

    override fun clone() {
        TODO("Not yet implemented")
    }

    override fun dragon() {
        TODO("Not yet implemented")
    }


    override fun drag() {
        println("Circle is draging")
    }

}



class rectange3(val l:Double,val b:Double):Shape3() {
    override fun area() = l * b
    override fun drag() {
        println("rectangle is dragging")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }

    override fun dragon() {
        TODO("Not yet implemented")
    }
}
class Player(val name:String): dragonit{
    override fun dragon() {
        TODO("Not yet implemented")
    }

    fun drag()=println("$name is dragging")
}
