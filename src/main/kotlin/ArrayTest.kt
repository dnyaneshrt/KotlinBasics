fun main()
{
   /* var names: Array<String>
    names= arrayOf("java","c","c++","android","kotlin")*/
    var names:IntArray
    names= intArrayOf(15,52,84,52,411,5)
    println(names.size)
    for(name in names)
    {
        println(name)
    }
    for(i in names.size-1 downTo 0)
    {
        println(names[i])
    }
}