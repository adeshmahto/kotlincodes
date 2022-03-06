class Constructor {
}

fun main(){
    val p1=person("Adesh",21)

}
class person(val name1:String,val age1:Int){

    init {
        println("$name1 is created")
    }


    val name:String=name1
    init {
        print("$name is 2nd initializer")
    }


    val age:Int=age1

}
class  automobile( val name:String,val tyre:Int,val Model:String){

    constructor( namep:String,Model: String):this(namep,4,Model)// secondary constructor , one value is already defined here
    // example in all car has only 4 tyre it is same for all car so we defined here for all car
}