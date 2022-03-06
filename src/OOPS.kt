

fun main (){
 val mustang=car("celerio","petrol",100)
  print(mustang.name)
    mustang.driveCar()


}
class car(val name:String,val type :String,val kmrange:Int){
    fun driveCar(){
        println("$name car is running")
    }
    fun applybreak(){
        println("break is pressed!")
    }


}