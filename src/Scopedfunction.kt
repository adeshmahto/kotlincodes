fun main() {
    val emp=Employee()

    emp.age=21
    emp.name="Adesh"
    // use of apply
    emp.apply {
        age=32
        name="adity"
    }
    println(emp.age)
    println(emp.name)
     //       or

    // use of let

    emp.let {                             //it return value depend up last statement
        println(it.name)
        println(it.age)
    }

    // use of withfunction
    with(emp){
        age=45
        name="ankit"
    }

  // use of run
  emp.run {
      age=56
      name="ram"
  }


}


data class Employee(var name:String=" ", var age:Int=10)