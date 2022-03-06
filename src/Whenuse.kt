class Whenuse {
}
fun main(){

//    var animal="Dog"
//
//    when(animal){
//        "Dog"-> print("animal is dog")
//        "horse"-> print("animal is horse")
//        "cat"-> print("animal is cat")
//        else->print( "animal is not found")
//
//    }
    val num=8

    val result=when(num){
        5-> "five"
        6-> " six"
        in 6..10 ->"in btw 6 to 10"
        else->{"not found"}
    }
    print(result)


}