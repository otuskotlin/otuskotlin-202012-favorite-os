import ru.otus.favorites.multiplatform.shared.User
import kotlin.test.Test
import kotlin.test.assertEquals

internal class UserTest {

    @Test
    fun testModel() {
        val model = User(id = "1", name = "one")

        assertEquals("1", model.id)
        assertEquals("one", model.name)
    }
}