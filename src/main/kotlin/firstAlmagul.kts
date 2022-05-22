import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val minutes = LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm")).toByte() //перевожу в численный тип

if (minutes % 2 != 0) //остаток от деления минуты на 2 сравниваю с 0
    println("Сейчас значение минут нечетное: " + minutes)
else
    println("Сейчас значение минут четное: " + minutes)
