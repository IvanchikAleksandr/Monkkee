import Page.DiaryEntry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteEntryWithoutPermissionTest extends BaseTest {

    @Test
    public void DeleteEntryWithoutPermission() {
        // Создание экземпляра класса, содержащего запись в дневнике без прав для удаления.
        DiaryEntry entry = new DiaryEntry(false);

        // Удаление записи из дневника.
        entry.delete();

        // Проверка отображения ошибки.
        Assert.assertTrue(entry.isErrorDisplayed());
    }
}
