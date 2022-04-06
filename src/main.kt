fun main(){
oddnum(100)
    var x=returnlength(arrayOf("agatha","sam","ankuna","tresure"))
    println(x)
    createrobot(13)
    multiples()

}

fun oddnum(nun:Int) {
    for (nun in 1..100) {
        if ((nun % 2) == 1)
            println(nun)
    }
}
fun returnlength(name:Array<String>):Int {
    var nam =0
    name.forEach { a ->
        if (a.length >= 5) {
           nam++
        }
    }
        return nam
}
fun createrobot(drink:Int){
    if (drink<6) {
        println("milk")
    }else{
        if(drink<15 && drink>6){
        println("fanta orange")
    }else{
        println("cocacola")

    }
}}
fun multiples(){
    for (a in 1..100){
    if ((a%3)==0&&(a%5)==0){
        println("fizzbuzz")
}else if((a%3)==0){
    println("fizz")
}else if((a%3)==0){
    println("buzz")
    }else(a)
 }
}