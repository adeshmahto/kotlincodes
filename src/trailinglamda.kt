



fun main() {
    funarg( message = "hello adesh") {
        add1(2, 3) }
}
val add1:(Int,Int)->Int={a,b->a+b}
fun funarg(message:String, fn: () -> Int){
    println("$message and ${fn()}")
}