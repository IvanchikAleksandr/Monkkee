import page.BaseTest;
import page.DiaryEntry;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EditEntyTest extends BaseTest {
    @Test
    public void EditEntry() {
        // Создание экземпляра класса, содержащего запись в дневнике.
        DiaryEntry entry = new DiaryEntry();

        // Редактирование заголовка и содержания записи.
        entry.setTitle();
        entry.setContent();

        // Проверка успешности редактирования записи.
        assertEquals("Новый заголовок", entry.getTitle());
        assertEquals("Новое содержание", entry.getContent());
    }
}
