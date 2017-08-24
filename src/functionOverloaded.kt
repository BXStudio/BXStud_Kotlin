fun somme(x1:Int, x2:Int):Int{
    return x1+x2
}
fun somme(x1:Int, x2:Int, x3:Int):Int{
    return x1+x2+x3
}
fun somme(x1:Int, x2:Int, x3:Int, x4:Int):Int{
    return x1+x2+x3+x4
}

fun main(args:Array<String>){
    var sommeNb=somme(5,10)
    println("Somme des nb : $sommeNb")

    sommeNb=somme(5,10, 15)
    println("Somme des nb : $sommeNb")

    sommeNb=somme(5,10, 15, 16)
    println("Somme des nb : $sommeNb")
}