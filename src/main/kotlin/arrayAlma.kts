import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

var odds = emptyArray<String>()

val time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH"))

odds = arrayOf ("01", "03", "05", "07", "09", "11")

if (time in odds)
    println("Сейчас значение часа нечетное: " + time)
else
    println("Сейчас значение часа четное: " + time)