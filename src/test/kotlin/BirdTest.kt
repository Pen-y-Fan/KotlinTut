import demo.Bird
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class BirdTest {

    private val tweety = Bird("Tweety", true)

    @Test
    fun testBird() {
        assertEquals("Tweety", tweety.name)
        assertNotEquals("Polly", tweety.name)
    }
}