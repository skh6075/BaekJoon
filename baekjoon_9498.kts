import java.io.*

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    val num = input.readLine().toInt()

    println(
            if(num >= 60 && num < 70)
                "D"
            else if(num >= 70 && num < 80)
                "C"
            else if(num >= 80 && num < 90)
                "B"
            else if(num >= 90 && num <= 100)
                "A"
            else "F"
    )
}

main()