import org.testng.annotations.Test;

import javax.security.auth.login.LoginException;
import java.security.AuthProvider;

import static org.testng.AssertJUnit.assertTrue;

public class Logout {


    private AuthProvider UserAccount;

    public Logout(AuthProvider userAccount) {
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
