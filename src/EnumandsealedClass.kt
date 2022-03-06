class EnumandsealedClass {
}

fun main(){

//    println(day.Number)

       val day=Day.sunday
    println(day.formatday())



}
enum class Day(val Number:Int){
    Monday(1),
    tuesday(2),
    wednesday(3),
    thursday(4),
    friday(5),
    saturday(6),
    sunday(7);

    fun formatday(){
        println("this day is $this")
    }

}