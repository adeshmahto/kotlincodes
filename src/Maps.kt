fun main() {

    val student= mutableMapOf<Int,String>()

    student.put(1,"Adesh")
    student.put(2,"Anish")
    student.put(3,"adity")
    student.put(4,"ankit")
    for((key,value )in student){
        println("key->$key|| value->$value")

    }

    student[5]="annesha"
    println(student[4])

    val student1= mapOf<Int,String>(1 to "Adesh")




}