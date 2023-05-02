import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CreateEntryWithoutTitle {
    @Test
    public void testCreateEntryWithoutTitle() {
        // Создание новой записи в дневнике без названия.
        DiaryEntry entry = new DiaryEntry("", "Содержание записи");

        // Проверка отображения ошибки.
        assertTrue(entry.isErrorDisplayed());
    }
}
