import com.web.app.tests.action.LoginAction;
import com.web.app.tests.webdriver.CreateWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.web.app.tests.config.ConfigUtil.getRGConfig;

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
                .fillFramesAndTapLogin(getRGConfig().getUserEmail(), System.getProperty("user_pass"))
                .checkMainElement();
    }
}
