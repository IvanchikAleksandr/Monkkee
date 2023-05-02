import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class CreateNewAccount {

    private final WebDriver driver;


    public CreateNewAccount(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void testCreateNewAccount() {
        String firstName = "Alex";
        String lastName = "Ivanchik";
        String email = "test@example.com";
        String password = "password123";

        // Заполнение полей формы регистрации.
        WebElement firstNameInput = driver.findElement(By.name("first_name"));
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        lastNameInput.sendKeys(lastName);

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        // Нажатие на кнопку "Create your account".
        WebElement createAccountButton = driver.findElement(By.cssSelector(".btn[type='submit']"));
        createAccountButton.click();

        // Проверка наличия сообщения об успешной регистрации.
        WebElement successMessage = driver.findElement(By.cssSelector("div.alert-success"));
        assertTrue(successMessage.isDisplayed());

        // Проверка перенаправления на страницу дневника после регистрации.
        String expectedUrl = "https://monkkee.com/app/#/diary";
        assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}
