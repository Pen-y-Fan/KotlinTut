import demo.Dog
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

class DogTests {
    @Test
    fun testDog() {
        val spot = Dog("Spot", 20.0, 14.5, "Paul Smith")

        assertSame("Spot", spot.name)
        assertEquals(14.5, spot.weight)
        assertSame("Paul Smith", spot.owner)
        assertEquals(20.0, spot.height)
    }
}
