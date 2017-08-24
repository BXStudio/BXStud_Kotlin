/**
 * Created by hugot on 11/07/2017.
 */

// This is the main function
fun main(args: Array<String>){

    // Enter the caracteristics
    print("Enter your name : ")
    val name= readLine()

    print("Enter your age : ")
    var age:Int= readLine()!!.toInt()

    print("Enter your job : ")
    val job:String?
    job=readLine()

    /* Output print
    to allow users to see the variables values
     */

    println("--- OUTPUT ---")
    println("name : " + name)
    println("age : " + age)
    println("job : " + job)
}