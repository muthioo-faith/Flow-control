fun main(){
OddNmbers()
    var longerNames= longerNames(arrayOf("Mumbua","Everline","Faith","Mutua","Samuel"))
    println(longerNames)
    robot(4)
    robot(12)
    robot(29)
    multiples()
}
fun OddNmbers() {
    for (num in 1..100)
        if (num % 2 != 0) {
            println(num )
        }
}
fun longerNames(name:Array<String>):Int{
    var number=0
    name.forEach { name->
  if(name.length>5)
      number++
    }
    return number
}
fun robot(age:Int){
    if(age<6) {
        println("glass of milk")
    }
    else if(age<15 && age>6){
        println("A bottle of fanta Orange")
    }
    else{
        println("A bottle of Cocacola")
    }

}
fun multiples(){
for(num in 1..100){
    if(num%3==0 && num%5==0){
        println("FizzBuzz")
    }
    else if(num%3==0){
        println("fizzz")
    }
    else if(num%5==0){
        println("Buzzz")
    }
    else{
        println(num)
    }


}
}