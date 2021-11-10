import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var input = BufferedReader(InputStreamReader(System.`in`))
    val year = input.readLine().toInt()

    println(
            if(
                    year % 4 == 0 && year % 100 != 0
                    || year % 400 == 0
            )
                "1" else "0"
    )
}
main()