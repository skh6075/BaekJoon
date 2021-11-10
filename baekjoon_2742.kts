import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    val num = input.readLine().toInt()

    for (i in num downTo 1) {
        println(i)
    }
}
main()