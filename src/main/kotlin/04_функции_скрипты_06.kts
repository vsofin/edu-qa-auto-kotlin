val names = mutableListOf<String>()

fun greeting(say: String, names: List<String>): Boolean {

    for (item in names) {
        println("$say, $item")
    }

    return names.isNotEmpty()
}

if ( !greeting("Hello", names) )
    println("Nobody")

val namesHi = mutableListOf<String>()
if ( !greeting("Hi", namesHi) )
    println("Nobody")