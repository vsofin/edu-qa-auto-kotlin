val names = mutableListOf<String>()

class Human {

    fun greeting(say: String, names: List<String>) {
        for (item in names) {
            println("$say, $item")
        }
    }

}

val human = Human()
human.greeting("Hello", names)