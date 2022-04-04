package tests.user;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginAndReg;
import tests.TestBase;

public class RegistrationTests extends TestBase {
    HomePage homePage;
    LoginAndReg loginAndReg;
    @BeforeMethod
    public  void initTest(){
        homePage = new HomePage();
        loginAndReg = new LoginAndReg();
    }
    @Test
    public void regPositiveTest(){

    }
}
