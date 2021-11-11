import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = input.readLine().split(' ').map { it.toInt() }
    println(a * b)
}
main()