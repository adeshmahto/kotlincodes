fun main() {
    add(1,2,3,4,5,6,9)
    add(1,2,3,111,1,1,1,1,)

    multiple(2,4)
}

fun add(vararg values:Int):Unit{
    var sum=0
    for(i in values){
        sum+=i
    }
    println(sum)
}

fun multiple(a:Int ,b:Int):Int{

    return a*b
}



