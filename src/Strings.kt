fun main(args:Array<String>){
    var phrase =" Ceci est une phrase d'accroche !"
    println(phrase) // Affiche de manière brute
    println("La phrase est : " + phrase) // Inclusion de la phrase
    println("La phrase est $phrase ") // Inclusion de la phrase

    var phrase2 = " Il fait " + "beau"
    println("Phrase2:" +phrase2[2]) // Affiche le 3ème caractère
    println(phrase.toLowerCase()) // Met tout en majuscule
    println(phrase.toUpperCase()) // Met tout en minuscule
    println(phrase.trim()) // Efface les espaces du début et fin
    println(phrase.split(" ")) // Sépare chaque mot
    // Peut être agencé de la sorte...
    println("Phrase:$phrase".toUpperCase())
}