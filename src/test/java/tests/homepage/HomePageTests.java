package tests.homepage;

import helpers.APIHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

public class HomePageTests extends TestBase {
    HomePage homePage;
    @BeforeMethod
    public  void initTest(){
        homePage = new HomePage();
    }
    @Test
    public void homePageValidationTest() {

    }

}
