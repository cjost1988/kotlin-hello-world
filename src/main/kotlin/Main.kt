import java.time.LocalDate
import java.time.format.DateTimeParseException

fun main() {
    println("What's your name?")
    val name = readln()
    println("When were you born?")
    var person: Person? = null;

    while (person === null) {
        try {
            val birthday = readln()
            person = Person(name, LocalDate.parse(birthday))
        } catch (e: DateTimeParseException) {
            println("Invalid date, please try another date:")
        }

    }

    println("Hello ${person.name}, you're ${person.age} years old.")
}

class Person(val name: String, birthday: LocalDate) {
    val age = LocalDate.now().year - birthday.year
}