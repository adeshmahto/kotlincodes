import kotlin.math.pow

fun main() {


    calculator(3.5,5.6,::sum)

}

fun sum(a:Double,b:Double):Double
{
    return a+b
}
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){

    val result=gn(a,b)
    println(result)

}
