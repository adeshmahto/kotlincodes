fun main() {


    val lambda1={x:Int,y:Int->x+y}    // lambda expression
//    val multilinelambda={
//        println("hello lambda")
//        val a=2+3
//        a
//    }


//    val singlelamda:(Int)->Int={x->x*x}
//    val l={x:Int->x*x}
    val l1:(Int)->Int={it+it}
    println(l1(34))



}