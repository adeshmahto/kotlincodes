class VisibilityModifier {
}
fun main(){
    val obj=B()


}

open class A{
    public var p=10
    private var q=20
    internal var e=30
    protected  var t=40


}
class B:A(){
    fun test(){
        println(p)
        //println(q)  // error showing
        println(e)
        println(t)
    }

}