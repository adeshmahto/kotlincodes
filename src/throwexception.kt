import java.lang.IllegalArgumentException

fun main() {
createUserlist(-12)
}

fun createUserlist(count:Int){
    if(count<0){
        throw IllegalArgumentException("count must be greater then 0")
    }else{
        println("we created a userlist no $count")
    }
}