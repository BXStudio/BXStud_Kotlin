
fun main(args:Array<String>){

    println("*** Calculatrice Basique ***")
    print("Enter n1 : ")
    var v1:Float= readLine()!!.toFloat()
    print("Enter n2 : ")
    var v2:Float= readLine()!!.toFloat()

    var som:Float?
    som=v1+v2
    println("Somme : " + som)
}