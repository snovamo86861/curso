package ko

//What will be printed?

fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

fun main(){
    println("First ${foo()} second ${foo()}")
}