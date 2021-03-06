package scripts

fun main() {
    val input: Int = readLine()!!.toInt()

    val output1 = if (input == 0) {
        "zero".hashCode()
    } else if (input % 2 == 0) {
        "even".hashCode()
    } else {
        "not even".hashCode()
    }

    val b = 2
    val a = b + 1

    val output2 = when {
            input == 0 -> {
                "zero"
            }
            input % 2 == 0 -> {
                "even"
            }
            else -> {
                "not even"
            }
        }

    if (a == 3) {
        println("3")
    } else {
        println("!3")
    }

    val array = intArrayOf(1, 2, 3)
    val filter = array.map {
        val k = it + 2
        it + 1
    }.filter {
        it % 2 != 0
    }
    println("$output1\n$output2\n$filter")
}

fun print() {
    println("Hello")
}