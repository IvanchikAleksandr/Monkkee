import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import static org.testng.AssertJUnit.assertTrue;

    public class CreateNewAccauntWithoutRequiredFieldsTest {
        public CreateNewAccauntWithoutRequiredFieldsTest(SearchContext driver) {
            this.driver = (WebDriver) driver;
        }
        @Test
        public void testCreateNewAccountWithoutRequiredFields() {
            // Нажатие на кнопку "Create Account".
            WebElement createAccountButton = driver.findElement(By.cssSelector("a[title='Create Account']"));
            createAccountButton.click();

            // Нажатие на кнопку "Create your account".
            WebElement createButton = driver.findElement(By.cssSelector(".btn[type='submit']"));
            createButton.click();

            // Проверка наличия ошибок валидации.
            List<WebElement> errorMessages = driver.findElements(By.cssSelector(".is-invalid"));
            assertTrue(errorMessages.size() > 0);
        }

    }