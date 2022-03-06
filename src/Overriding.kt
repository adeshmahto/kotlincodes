class
Overriding {
}
fun main(){
    val phone=oppo("iphone")
    phone.display()
    println(phone.toString())
}
open class Mobile(val type:String){
    open  val name: String=" "                      // open is like giving permission for overriding !
   open val size: String=" "
   open  fun display()= println("simple mobile display")

}
class oppo(typeparan:String):Mobile(typeparan){
    override val name: String=""
    override val size: String=" "


    override fun display() {
        super.display()
        println("oppo display")
    }
}





















































































