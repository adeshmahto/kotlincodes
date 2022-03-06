fun main() {

    var gender2:String?=null


    gender2?.let {
        println("Line 1")
        println("Line 2")
        println("Line 3 $it")

    }

    var selectedValue= gender2?:"NA"
    println(selectedValue)

    var value:String = gender2!!.toUpperCase()

    print(value)

}
