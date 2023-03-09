package schedule.game.bot

import kotlin.test.Test
import kotlin.test.assertNotNull

class ApplicationTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = Application()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
