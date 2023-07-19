fun main(args:Array<String>)
{
    println("inline function: ${addNumbers(101, 205, test())}")
    println(MethodTest().display())
    addNumbers(25,205,test(25))
}

//read about named arguments and default value passing to functions

//void means Unit
//two inline function

/*
fun addNumbers(num1:Int, num2:Int): Int {
  return num1+num2
}*/
fun addNumbers(num1: Int, num2: Int, test: Unit)=num1+num2

fun test(i: Int=555)
{
    println("I am from test function:  $i")
}


