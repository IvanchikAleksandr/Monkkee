import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.BaseTest;

import java.time.Duration;
import java.util.UUID;



    public class MonkkeeTest extends BaseTest {


        @Test
        public void loginTest() {
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

            emailField.sendKeys("test@example.com");
            passwordField.sendKeys("testPassword");
            emailField.sendKeys("ivanchikaleksandr11@gmail.com");
            passwordField.sendKeys("alex1111");
            loginButton.click();

            WebElement userProfile = driver.findElement(By.xpath("//a[@aria-label='User']"));
            Assert.assertTrue(userProfile.isDisplayed(), "User profile is not displayed after successful login");
        }
        @Test
        public void signUpTest() {
            WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
            signUpButton.click();
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement confirmPasswordField = driver.findElement(By.id("password-confirm"));
            WebElement signUpSubmitButton = driver.findElement(By.xpath("//button/span[contains(text(),'Sign up')]"));


            String uniqueEmail = "ivanchikaleksandr11+" + UUID.randomUUID() + "@gmail.com";

            emailField.sendKeys(uniqueEmail);
            passwordField.sendKeys("testPassword");
            confirmPasswordField.sendKeys("testPassword");
            passwordField.sendKeys("alex1111");
            confirmPasswordField.sendKeys("alex1111");
            signUpSubmitButton.click();

            WebElement accountActivationHeading = driver.findElement(By.xpath("//h2[contains(text(),'Thanks for signing up!')]"));
            Assert.assertTrue(accountActivationHeading.isDisplayed(), "Account activation heading is not displayed after successful sign-up");
        }
        @Test
        public void addNoteTest() {
            WebElement addNoteButton = driver.findElement(By.xpath("//a[contains(text(),'Add note')]"));
            addNoteButton.click();
            WebElement noteTitleField = driver.findElement(By.id("plain-title"));
            WebElement noteTextArea = driver.findElement(By.id("plain-text"));
            String uniqueNoteTitle = "Test Note Title - " + UUID.randomUUID();
            String uniqueNoteText = "Test Note Text - " + UUID.randomUUID();
            noteTitleField.sendKeys(uniqueNoteTitle);
            noteTextArea.sendKeys(uniqueNoteText);
            WebElement saveNoteButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
            saveNoteButton.click();
            WebElement noteTitle = driver.findElement(By.xpath("//h1[contains(text(),'" + uniqueNoteTitle + "')]"));
            WebElement noteText = driver.findElement(By.xpath("//div[contains(text(),'" + uniqueNoteText + "')]"));
            Assert.assertTrue(noteTitle.isDisplayed(), "Note title is not displayed after save");
            Assert.assertTrue(noteText.isDisplayed(), "Note text is not displayed after save");
        }
        @Test
        public void editNoteTest() {
            WebElement firstNote = driver.findElement(By.xpath("//div[@class='note-list__item__content']/h1"));
            firstNote.click();
            WebElement noteTitleField = driver.findElement(By.id("plain-title"));
            WebElement noteTextArea = driver.findElement(By.id("plain-text"));
            String editedNoteTitle = "Edited Test Note Title - " + UUID.randomUUID();
            String editedNoteText = "Edited Test Note Text - " + UUID.randomUUID();
            noteTitleField.clear();
            noteTitleField.sendKeys(editedNoteTitle);
            noteTextArea.clear();
            noteTextArea.sendKeys(editedNoteText);
            WebElement saveNoteButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
            saveNoteButton.click();
            WebElement noteTitle = driver.findElement(By.xpath("//h1[contains(text(),'" + editedNoteTitle + "')]"));
            WebElement noteText = driver.findElement(By.xpath("//div[contains(text(),'" + editedNoteText + "')]"));
            Assert.assertTrue(noteTitle.isDisplayed(), "Edited note title is not displayed after save");
            Assert.assertTrue(noteText.isDisplayed(), "Edited note text is not displayed after save");
        }
        @Test
        public void deleteNoteTest() {
            WebElement firstNote = driver.findElement(By.xpath("//div[@class='note-list__item__content']/h1"));
            firstNote.click();
            WebElement noteTitle = driver.findElement(By.xpath("//div[@class='note__header']/h1"));
            WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
            String noteTitleText = noteTitle.getText();
            deleteButton.click();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement noteTitleAfterDeletion = driver.findElement(By.xpath("//div[@class='note-list__item__content']/h1"));
            Assert.assertNotEquals(noteTitleAfterDeletion.getText(), noteTitleText, "Note was not deleted successfully");
        }

    }