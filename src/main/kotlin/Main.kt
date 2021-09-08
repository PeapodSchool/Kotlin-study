const val TEST = 5

fun main(args: Array<String>) {

    val a: Int = 5
    var res: Double

    println("Hello World!")
    printMsg("Kotlin")
    printMsgPrefix("Kotlin", "Good")
    printMsgPrefix(prefix = "Good", msg = "Kotlin")
}

fun printMsg(msg: String) {
    println(msg)
}

fun printMsgPrefix(msg: String, prefix: String) {
    //println(msg + prefix)
    println("$prefix $msg")
}