fun main() {

    val num3= listOf<Int>(1,2,3,4,5,6)
    val list2=num3.filter {a:Int-> a % 2 !=0 }     // a->it
    //print(list2)

    val userlist= listOf(
        User(1,"Adesh"),
        User(2,"Adity"),
        User(3,"ankit")
    )

   val filtering= userlist.filter { it.id==3 }        // it will find the id no. 3
    val list=num3.map { it * it }                     // it change the previous no into square of it


    val paidlist=userlist.map {   paidUser(it.id,it.name,"paid") }
    println(paidlist)

}
data class User(val id:Int,val name:String)
data class paidUser(val id:Int,val name:String,val type:String)
