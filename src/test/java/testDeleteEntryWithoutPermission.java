import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class testDeleteEntryWithoutPermission {

    @Test
    public void testDeleteEntryWithoutPermission() {
        // Создание экземпляра класса, содержащего запись в дневнике без прав для удаления.
        DiaryEntry entry = new DiaryEntry("Заголовок записи", "Содержание записи", false);

        // Удаление записи из дневника.
        entry.delete();

        // Проверка отображения ошибки.
        Assert.assertTrue(entry.isErrorDisplayed());
    }
}
