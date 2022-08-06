package ko

// functions: default values
//joinToString function allows you to print list contents in the desired way


fun displaySeparator(character: String = "*", size: Int=10){
    repeat(size) {
        print(character)

    }
}

fun main(){
    println(displaySeparator())
}



