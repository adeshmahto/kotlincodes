class Functions {
}
fun main(){
print()
print(4) // argument
}
fun print(count:Int=3){        // parameter or it is val type
    println("hello $count")
}

fun add(num1:Int,num2:Int)=num1+num2

fun evenodd( x:Int){
  var result=if(x % 2 ==0) "Even" else " Odd"
print(result)
}