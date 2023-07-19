fun main(args:Array<String>)
{
var ctest:ConstructorTest=ConstructorTest(101)
//ctest.use()
}

//primary: we can have only one primary constructor per class
//secondry: we can have any no.of secondry constructors
//at a time only one type of constructor allowed
/*class ConstructorTest(num:Int){
    init {
        println("num is $num")
    }

 *//*fun use()
 {
     println("num is $num")
 }*//*
}*/
class ConstructorTest {
    constructor()
    {
        print("I am from secondry cons")
    }
    constructor(num:Int)
    {
        print("I am from secondry cons with param")
    }
}