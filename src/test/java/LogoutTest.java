import org.testng.annotations.Test;

import javax.security.auth.login.LoginException;
import java.security.AuthProvider;

import static org.testng.AssertJUnit.assertTrue;

public class LogoutTest extends BaseTest {


    private final AuthProvider UserAccount;

    public LogoutTest(AuthProvider userAccount) {
        UserAccount = userAccount;
    }

    @Test
    public void testLogout() throws LoginException {
        // Выход из аккаунта.
        UserAccount.logout();

        // Проверка перенаправления на страницу входа в аккаунт.
        assertTrue(LoginPage.isPageOpened());
    }

    private static class LoginPage {

        public static boolean isPageOpened() {
            return false;
        }
    }
}
