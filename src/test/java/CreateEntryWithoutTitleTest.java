import page.DiaryEntry;
import org.testng.annotations.Test;

    public class CreateEntryWithoutTitleTest {
        @Test
        public void CreateEntryWithoutTitle() {
            // Создание новой записи в дневнике без названия.
            DiaryEntry entry = new DiaryEntry();

            // Проверка отображения ошибки.
            entry.isErrorDisplayed();

        }
    }

