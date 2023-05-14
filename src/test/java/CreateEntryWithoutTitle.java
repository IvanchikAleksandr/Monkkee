import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CreateEntryWithoutTitle {
    @Test
    public void testCreateEntryWithoutTitle() {
        // Создание новой записи в дневнике без названия.
        DiaryEntry entry = new DiaryEntry("", "Содержание записи");

        // Проверка отображения ошибки.
        AssertJUnit.assertTrue(entry.isErrorDisplayed());
    }
}
