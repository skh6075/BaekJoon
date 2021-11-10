import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    val num = input.readLine().toInt()

    for (i in 1..num) {
        println(i)
    }
}
main()