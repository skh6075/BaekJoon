import java.io.*

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = input.readLine().split(' ').map { it.toInt() }

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
}
main()