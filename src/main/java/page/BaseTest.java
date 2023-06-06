package page;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

    public class BaseTest {
        protected WebDriver driver;
        protected Object object;
        @BeforeClass
        public static void setup() {
            System.setProperty("Webdriver.chrome.driver", "C:/Users/user/tms/Monkkee/src/page/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://monkkee.com/app/#/");
        }
        @AfterMethod(alwaysRun = true)
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

