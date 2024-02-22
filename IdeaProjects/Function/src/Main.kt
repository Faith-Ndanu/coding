//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    add(24,87)
    add(78,89)
    add(-387,-679)
    printFullName("Arthur","Holland")
    getStringLength("Air Freshener")
    division(7.0,2)
    var x = division(7.0,2)
    println(x)
    var y = add(7,2)
    println(y)


}
    fun add(num1: Int, num2: Int):Int {
        var result = num1 + num2
        println(result)
        return result
    }

fun printFullName(firstName: String,lastName: String){
    var fullName = firstName + " "+ lastName
    println(fullName)
}

fun getStringLength(word:String):Int{
    return word.length


}

fun division(num1:Double,num2:Int):Double{
    var result = num1/num2
    println(result)
    return result
}
fun Diameter(){
    var radius = 14
    var pi = 3.142
    var result = radius*pi
    println(result)


}

