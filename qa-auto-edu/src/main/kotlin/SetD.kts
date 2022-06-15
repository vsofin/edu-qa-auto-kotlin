import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

var odds = setOf<String>()

val time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH"))

odds = setOf("01", "02", "03", "09")

if (time in odds)
    println("Сейчас значение часа нечетное: " + time)
else
    println("Сейчас значение часа четное: " + time)