class AbstracClass {
}

fun main(){
    val obj=Circle1(3.5)
    obj.display()
}
abstract  open class Shape1{
    open fun area ():Double{
        return 0.0
    }
    abstract fun display()
}
class Circle1(val radius:Double):Shape1() {

    override fun area():Double{
        return Math.PI*radius*radius
    }

    override fun display() {
        println("i am a display method")
    }

}