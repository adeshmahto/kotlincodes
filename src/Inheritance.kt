fun main(){
    val classs=child()
    classs.setstring("adesh mahto");
    classs.print1();



}
open class parent{      // open for give access to the class  to inheritance
    var name1 =" "
    init {
        println("parent constructor")
    }
    fun setstring(name4:String){
        name1=name4;
    }

    fun print1(){
        println( "i am a parent method $name1")
    }
}
class child:parent(){
    init {
        println("child constructor")
    }
    val name2=" "
    fun print2(){
        println("i am child method")
    }
}