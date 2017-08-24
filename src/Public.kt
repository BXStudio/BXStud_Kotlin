public open class ObjetsPublic(){
    // On peut appliquer le public à divers éléments
    public var piece1 = "Bureau"
    public var piece2 = "Cuisine"
    public fun Contenu1(e1:String,e2:String):String{
        //println("La piece est : $piece1")
        return e1+" , "+e2
    }
    fun Contenu2(e3:String,e4:String):String{
        //println("La piece est : $piece2")
        return e3+" , "+e4
    }
}

class testPublic():ObjetsPublic(){
    fun c1test(){
        println(piece1)
    }
}

fun main (args:Array<String>){
    var Ob = ObjetsPublic()
    var t = testPublic()
    println("Test pièce : ${t.piece1}")

    println("Le contenu de la ${Ob.piece1} est : ${Ob.Contenu1("Enceintes", "Ordinateur")}")
    println("Le contenu de la ${Ob.piece2} est : ${Ob.Contenu2("Verres", "Assiettes")}")
}