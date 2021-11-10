import java.io.*

fun main() {
    var input = BufferedReader(InputStreamReader(System.`in`))
    var number: Int = input.readLine().toInt()
    var copy: Int = number
    var count: Int = 0

    do{
        number = number % 10 * 10 + (number / 10 + number % 10) % 10
        count ++
    }while (copy != number)

    println(count)
}
main()
//
//
//   아래 소스도 작동함
//   시간 초과로 다시 만듬
//
//
//    var str: String = num.toString()
//    var num1: Int = str.substring(0, 1).toInt()
//    var num2: Int = str.substring(str.length -1).toInt()
//
//    var checkNumber = num1 + num2
//    var count: Int = 0
//    while (true) {
//        var now = num1 + num2
//        var toStr: String = now.toString()
//        var lastNumber: Int = toStr.substring(toStr.length - 1).toInt()
//
//        num1 = num2
//        num2 = lastNumber
//
//        now = num1 + num2
//        count++
//        if(checkNumber == now)
//            break
//    }
//    println(count)
//}