import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var input = BufferedReader(InputStreamReader(System.`in`))
    var num1: Int = input.readLine().toInt()
    var num2: Int = input.readLine().toInt()

    println(num1 * (num2 % 10))
    println(num1 * (num2 % 100 / 10))
    println(num1 * (num2 / 100))
    println(num1 * num2)
}
main()