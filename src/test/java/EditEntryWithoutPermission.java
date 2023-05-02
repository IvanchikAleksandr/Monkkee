import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditEntryWithoutPermission {
    @Test
    public void testEditEntryWithoutPermission() {
        // Создание экземпляра класса, содержащего запись в дневнике без прав для редактирования.
        DiaryEntry entry = new DiaryEntry("Заголовок записи", "Содержание записи", false);

        // Редактирование заголовка и содержания записи.
        entry.setTitle("Новый заголовок");
        entry.setContent("Новое содержание");

        // Проверка отображения ошибки.
        assertTrue(entry.isErrorDisplayed());
    }
}
