


fun main() {
    val obj = Intcontainer(4)
    obj.setvalue(33)
  //  println(obj.getvalue())

    val object1=generic<Double>(0.0);
    object1.setvalue(2.0)
    println(object1.getvalue())


}
class generic<T>(var data:T){
    fun setvalue(value: T){
        data=value
    }
    fun getvalue():T=data    // return data

}
class Intcontainer(var data:Int){

    fun setvalue(value:Int){
       data=value;

    }
    fun getvalue():Int{
        return data
    }

}