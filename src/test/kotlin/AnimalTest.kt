import demo.Animal
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class AnimalTest {

    private val testAnimal: Animal = Animal("Fido", 12.1, 3.5)

    @Test
    fun testAnimal() {
        assertEquals("Fido", testAnimal.name)
        assertEquals(12.1, testAnimal.height)
        assertEquals(3.5, testAnimal.weight)
    }
}