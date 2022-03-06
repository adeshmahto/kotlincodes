import java.lang.Exception
import java.lang.NullPointerException

fun main() {


    val arr= arrayOf(1,2,3,4)
    try {
       println(arr[10])
    }catch (ex:NullPointerException){
        println(ex)
    }
    catch (e:Exception){
        println("Please check the array index")
    }
    finally {
        println("i will execute no matter what")
    }

}

