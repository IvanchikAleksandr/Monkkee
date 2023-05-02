import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class DeleteEntry {

    private Object DiaryPage;

    public DeleteEntry(Object diaryPage) {
        DiaryPage = diaryPage;
    }

    @Test
    public void testDeleteEntry() {
        // Создание экземпляра класса, содержащего запись в дневнике.
        DiaryEntry entry = new DiaryEntry("Заголовок записи", "Содержание записи");

        // Удаление записи из дневника.
        entry.delete();

        // Проверка наличия сообщения об удалении и отсутствия записи на странице дневника.
        assertTrue(DiaryPage.finalize());
        assertFalse(DiaryPage.isEntryDisplayed(entry.getTitle()));
    }
}
