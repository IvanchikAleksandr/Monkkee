import page.BaseTest;
import page.DiaryEntry;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditEntryWithoutPermissionTest extends BaseTest {
    @Test
    public void EditEntryWithoutPermission() {
        // Создание экземпляра класса, содержащего запись в дневнике без прав для редактирования.
        DiaryEntry entry = new DiaryEntry(false);

        // Редактирование заголовка и содержания записи.
        entry.setTitle();
        entry.setContent();

        // Проверка отображения ошибки.
        assertTrue(entry.isErrorDisplayed());
    }
}
