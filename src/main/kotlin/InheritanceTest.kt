fun main() {
    var c = Child()
    c.parentMethod()
    c.childMethod()
}


open class Parent {
    fun parentMethod() {
        println("parent properties")
    }
}

class Child : Parent(), Bank {
    fun childMethod() {
        println("child properties")
    }

    override fun provideLoanInfo() {
        TODO("Not yet implemented")
    }

}

interface Bank {
    fun provideLoanInfo()
}


