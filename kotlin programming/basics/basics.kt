// hell world 

fun main() {
    println("Hello, world!")
    print("basics")
}

// variables
fun main() {
    val age = 24
    val name = "Timz"
    println("happ birthday ${name} you are ${age} years old")
}

// repeat function
    fun main() {
        val border = "*"
        printBorder(border)
        println("Happy birthday Timz")
        printBorder(border)
    }
    fun printBorder(border: String){
        repeat(23){
            print(border)
        }     
        println()
    }

// Repeat multiple parameters
    fun main() {
        val border = "'~.....~''"
        val numRepeat = 3
        printBorder(border,numRepeat)
        println("Happy birthday Timz")
        printBorder(border, numRepeat)
        
    }
    fun printBorder(border: String, numRepeat: Int){
        repeat(numRepeat){
            print(border)
        }
        println()
    }

