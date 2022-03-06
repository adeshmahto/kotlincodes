


fun main(){
    var p=pizza.create("Peppy Panner")
    val p1=pizza.create("Tomato")



}
class pizza(val type:String,val topping:String){
    companion object  factory{
       fun create(pizzatype:String):pizza{
            return when(pizzatype){
                "Tomato"->pizza("Tomato","Tomato,cheese")
                "Peppy Paneer"->pizza("paneer farm","paneer,Cheese busrt,Tomato,Onion")
                else->pizza("Basic","Onion,cheese")
            }
        }
    }
}

