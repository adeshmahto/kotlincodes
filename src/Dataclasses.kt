class Dataclasses {
}

fun main(){

    val p1=Person3(1,"Adesh")
    val p2=Person3(1,"Adesh")

//    println(p1)
//    println(p2)
   println(p1.hashCode())
    println(p2.hashCode())
    println(p1==p2)
//    val p3=p1.copy(4)
        //println(p3)
//    val (id,name)=p1                             // de-structuring
//    println(id)
//    println(p1.component1())

}

 data  class Person3(val id:Int,val Name:String){

}