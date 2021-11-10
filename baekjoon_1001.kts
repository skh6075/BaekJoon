import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = input.readLine().split(' ').map { it.toInt() }

    println(n - m)
}
main()

class S{
}