/**
 * Created by hugot on 11/07/2017.
 */
fun main(args: Array<String>){

    print("Enter your name : ")
    val name= readLine()

    print("Enter your age : ")
    val age:Int= readLine()!!.toInt()

    print("Enter your job : ")
    val job:String?
    job=readLine()

    println("--- OUTPUT ---")
    println("name : " + name)
    println("age : " + age)
    println("job : " + job)
}