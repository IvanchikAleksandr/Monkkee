import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Logout {
    private Object LoginPage;

    @Test
    public void testLogout() {
        // Выход из аккаунта.
        UserAccount.logout();

        // Проверка перенаправления на страницу входа в аккаунт.
        assertTrue(LoginPage.isPageOpened());
    }

}
