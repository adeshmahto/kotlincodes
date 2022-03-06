import kotlin.Array

class Polymorphism {
}
fun main(){
 //    val circle:Circle=Circle(3.0) // circle : Circle  means it is coming from Circle class
      //val circle:Shape//=Circle(3.0)    // it is a polymorphism , Shape is a parent class which hold the reference of child class and also can call of the child method
     //val square:Shape//=Square(1.2)

       val shapearr= arrayOf(Circle(3.4),Square(4.5),rectange(2.3,4.6))
    calculatearea(shapearr)

}




open class Shape{
    open fun area ():Double{
        return 0.0
    }
}

fun calculatearea(shape:Array<Shape>){
for(shapes in shape){
    println(shapes.area())
}
}


class Circle(val radius:Double):Shape() {

    override fun area():Double{
        return Math.PI*radius*radius
    }

}
class Square(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}
class rectange(val l:Double,val b:Double):Shape(){
   override fun area()=l*b

}