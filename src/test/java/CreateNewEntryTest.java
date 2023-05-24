import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

    public class CreateNewEntryTest extends BaseTest {




        @Test
        public void testCreateNewEntry() {
            String title = "My first entry";
            String content = "This is the content of my first entry.";

            // Нажатие на кнопку "New entry".
            WebElement newEntryButton = driver.findElement(By.cssSelector("a[title='New entry']"));
            newEntryButton.click();

            // Заполнение полей "Title" и "Content" формы создания записи.
            WebElement titleInput = driver.findElement(By.name("title"));
            titleInput.sendKeys(title);

            WebElement contentInput = driver.findElement(By.name("content"));
            contentInput.sendKeys(content);

            // Нажатие на кнопку "Save Entry".
            WebElement saveEntryButton = driver.findElement(By.cssSelector(".btn-save-entry"));
            saveEntryButton.click();

            // Проверка успешности создания записи.
            WebElement actualTitleElement = driver.findElement(By.cssSelector(".entry-title"));
            String actualTitle = actualTitleElement.getText();
            assertEquals(actualTitle, title);

            WebElement actualContentElement = driver.findElement(By.cssSelector(".entry-content"));
            String actualContent = actualContentElement.getText();
            assertEquals(actualContent,
                    content);
        }
    }

