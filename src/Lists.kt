fun main() {
 val num= listOf(1,2,3,5)
  //  println(num.get(0))
  //  num[0]=3             // error throw because of list is immutable
 val num2= mutableListOf<Int>(1,2,3,4,5)
 num2.add(500)
 num2[2]=222

 num2.addAll(num)
 for (i in num2){
     println(i)
 }
}