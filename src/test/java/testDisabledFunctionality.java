import jdk.internal.event.Event;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class testDisabledFunctionality {
    @Test(enabled=false)
    public void testDisabledFunctionality(Event DisabledFunctionality) {
        // Попытка использования отключенной функциональности.
        // Дополнительная проверка интерфейса и сообщения об отключении.
        assertFalse(DisabledFunctionality.isEnabled());
        assertTrue(DisabledFunctionality.isEnabled());
        assertEquals("Функциональность отключена", DisabledFunctionality.getClass());
    }
}
