

fun main() {
    calculatetime { loop(10000000) }
}

fun calculatetime(fn:()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time taken to execute ${end-start} ms")

}


fun loop( n:Long){
    for(i in 1..n){

    }

}