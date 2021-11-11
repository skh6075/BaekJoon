import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var input = BufferedReader(InputStreamReader(System.`in`))
    var (n, m) = input.readLine().split(' ').map { it.toDouble() }
    println(n / m)
}
main()