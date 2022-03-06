class ObjectExpression {
}


fun main(){
    val testobj=object:clone ,person1("Adesh mahto"){

       override fun cloneable()= println("cloneable ")
//
//        val number:Int=78
//        fun testube()=println("number is multiple by 2 ->${number*2}")
        override fun fullname() {
            super.fullname()                    // super class will call first
          println("upcoming googler")
        }
    }
    testobj.fullname()

}
interface  clone{
    fun cloneable()
}
open class person1(val name:String){
    open fun fullname(){
        println("My full name is $name")
    }
}