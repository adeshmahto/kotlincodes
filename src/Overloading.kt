import kotlin.math.pow

class Overloading {
}
fun main(){
//    var fn=::addition
//    print(fn(1,2))

    var fnn=::power
    print(fnn(3.0,7.0))
}

fun addition( a:Int,b:Int):Int
{
    return a+b
}
fun power(a:Double,b:Double):Double{

    return a.pow(b)
}
