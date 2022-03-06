fun main() {
//    val obj=outer.Nested()
//    obj.test()
//
    val inner=outer().Nested()
    inner.test()

}


class outer{
    var i=0
  inner  class Nested(){
        fun test(){

            println("I am in nested class $i")        // without inner keyword i is unknown for nested class
        }
    }
}

