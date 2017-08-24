open class Operations2(){
    var Nom:String?=null
    fun som(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sous(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun affichage():Unit{
        println("Name is : ${Nom!!.toUpperCase()}")
    }
}

class  MultiOperations2():Operations2(){
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
    fun multi(n1:Int,n2:Int):Int{
        return n1*n2
    }

    fun GetNom(){
        super.Nom
    }
}

fun main(args:Array<String>){
    // Premières opérations
    var op=Operations2()
    var som=op.som(7,14)
    println("som:"+ som)
    var sous= op.sous(4,9)
    println("sous:"+ sous)

    println("op.Nom : ${op.Nom}")
    op.affichage()

    // Secondes opérations
    var op2= MultiOperations2()
    som=op2.som(7,14)
    println("som:"+ som)
    sous= op2.sous(4,9)
    println("sous:" + sous)

}