import com.web.app.tests.action.LoginAction;
import com.web.app.tests.webdriver.CreateWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    LoginAction loginAction;

    @BeforeMethod
    public void init(){
        loginAction = new LoginAction();
        CreateWebDriver.createWebDriver();
    }

    @Test
    public void loginRG() {
        loginAction
                .checkFirstPage()
                .clickLoginButton()
                .fillFramesAndTapLogin("vadimvm11@gmail.com", System.getenv("user_pass"))
                .checkMainElement();
    }
}
