fun main() {

  val result=  calculator1(1,2){a,b->a*b}
  //  println(result)

 val result2= p4(1,3,2){a,b,c->a+b-c}       // (argument)->{task perform}

    println(result2)

}

fun calculator1(a:Int,b:Int,fn:(Int,Int)->Int):Int{
    return fn(a,b)
}


fun p4(a:Int,b:Int,c:Int,gn:(Int,Int,Int)->Int):Int{         // (function argument)->return type

    return gn(a,b,c)
}