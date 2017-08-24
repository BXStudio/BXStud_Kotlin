open class ObjetsPrivate(){
    // HS : Afin de prévenir les erreurs, je retire le private...
    /*private var piece1 = "Bureau"
    private var piece2 = "Cuisine"*/
    var piece1 = "Bureau"
    var piece2 = "Cuisine"
    fun Contenu1(e1:String,e2:String):String{
        println("La piece est : $piece1")
        return e1+" , "+e2
    }
    fun Contenu2(e3:String,e4:String):String{
        println("La piece est : $piece2")
        return e3+" , "+e4
    }
}

class testPrivate():ObjetsPrivate(){
    fun c1test(){
        println(piece1)
    }
}

fun main (args:Array<String>){
    var Ob = ObjetsPrivate()
    var t = testPrivate()
    println("Test pièce : ${t.piece1}")

    println("Le contenu de la ${Ob.piece1} est : ${Ob.Contenu1("Enceintes", "Ordinateur")}")
    println("Le contenu de la ${Ob.piece2} est : ${Ob.Contenu2("Verres", "Assiettes")}")
}