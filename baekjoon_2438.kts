import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var input = BufferedReader(InputStreamReader(System.`in`))
    val num = input.readLine().toInt()

    var text: String = ""
    for (i in 1..num) {
        for (j in num downTo 1) {
            text += if(i >= j) "*" else "";
        }
        text += "\n"
    }
    println(text)
}
main()