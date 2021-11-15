import java.io.*

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    var num = input.readLine().toInt()

    println(
            if(num % 2 == 1) "SK" else "CY"
    )
}
main()