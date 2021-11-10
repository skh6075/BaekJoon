import java.io.*

fun main(){
    var input = BufferedReader(InputStreamReader(System.`in`))
    var (hour, minute) = input.readLine().split(' ').map { it.toInt() }

    if(minute < 45){
        if(hour <= 0) hour = 24
        hour --
        minute = (60 + minute) - 45
    }else{
        minute -= 45
    }
    println("${hour} ${minute}")
}
main()