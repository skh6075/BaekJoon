import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var input = BufferedReader(InputStreamReader(System.`in`))
    var kg = input.readLine().toInt()
    var count = 0

    while (kg > 0) {
        if (kg % 5 == 0) {
            kg -= 5
            count++
        } else if (kg % 3 == 0) {
            kg -= 3
            count++
        } else if (kg >= 5) {
            kg -= 5
            count++
        }else{
            count = -1
            break
        }
    }
    println(
            count
    )
}
main()