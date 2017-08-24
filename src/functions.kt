fun somme(x1:Double, x2:Double):Double{
    var somme=x1+x2
    return somme
}

fun afficher(x:Int=0):Unit{ // Si on ne donne aucune valeur pour x alors, la valeur affichée sera 0
    // Pas besoin de return
    println("x: $x")
}

fun vide(){
    println("Affichage Vide")
}

fun main(args:Array<String>){
    var s=somme(32.2,0.5) // on défini des valeurs pour les variables x1 et x2
        println("s: $s") // Le calcul s'effectue comme prévu dans la fonction somme

    s=somme(3.8,14.0)
    println("s: $s")

    vide()
    afficher(7)
    afficher() // On ne précise aucune valeur, la valeur affichée est donc 0
}