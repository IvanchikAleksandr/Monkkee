import Page.DiaryEntry;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;



    public class DeleteEntryTest extends BaseTest {



        public DeleteEntryTest(Object diaryPage) {
            this.object = diaryPage;
        }

        @Test
        public void testDeleteEntry() {
            // Создание экземпляра класса, содержащего запись в дневнике.
            DiaryEntry entry = new DiaryEntry();

            // Удаление записи из дневника.
            entry.delete();

            // Проверка наличия сообщения об удалении и отсутствия записи на странице дневника.
            assertTrue(DiaryPage());
            assertFalse(DiaryPage(entry.getTitle()));
        }

        private boolean DiaryPage(String ignoredTitle) {
            return false;
        }

        private boolean DiaryPage() {
            return false;
        }
    }

