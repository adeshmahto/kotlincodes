class `Getter&Setter` {
}

fun main(){
    val p1=Person("adesh",21)
  println(p1.name)
}

//class calculator{ // default constructor
//
//   lateinit var message:String // lateinit use
//
//    fun add(a:Int, b:Int):Int
//    {
//        return a+b
//    }
//}

class Person( namep:String, agep:Int){
    val name:String=namep
    get(){
        return field.toUpperCase()
    }
    var age: Int =agep
    set(value) {
        if(value>0){
            field=value
        }else{
            println("age cant be -ve")
        }
    }
}

