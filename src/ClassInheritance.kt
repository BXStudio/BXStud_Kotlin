open class Operations(){
    // On utilise "open" pour sortir de notre final
    fun som(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sous(n1:Int,n2:Int):Int{
        return n1-n2
    }
}

class  MultiOperations():Operations(){
    // On récupère notre précédente classe (dite Open)
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
    fun multi(n1:Int,n2:Int):Int{
        return n1*n2
    }
}

fun main(args:Array<String>){
    // 1ère opération
    var op=Operations()
    var som=op.som(7,14)
    println("som:"+ som)
    var sous= op.sous(4,9)
    println("sous:"+ sous)

    // 2ème opération
    var op2=  MultiOperations()
    som=op2.som(7,14)
    println("som:"+ som)
    sous= op2.sous(4,9)
    println("sous:"+ sous)

}