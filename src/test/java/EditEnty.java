import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EditEnty {
    @Test
    public void testEditEntry() {
        // Создание экземпляра класса, содержащего запись в дневнике.
        DiaryEntry entry = new DiaryEntry("Заголовок записи", "Содержание записи");

        // Редактирование заголовка и содержания записи.
        entry.setTitle("Новый заголовок");
        entry.setContent("Новое содержание");

        // Проверка успешности редактирования записи.
        assertEquals("Новый заголовок", entry.getTitle());
        assertEquals("Новое содержание", entry.getContent());
    }
}
