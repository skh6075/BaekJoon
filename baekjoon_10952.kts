import java.io.*
import java.util.*

fun main() {
    var arr = arrayListOf<Int>();
    var input = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val (a, b) = input.readLine().split(' ').map { it.toInt() }
        if(a + b == 0){
            break
        }
        arr.add(a + b)
    }
    arr.forEach({
        println("$it")
    })
}
main()