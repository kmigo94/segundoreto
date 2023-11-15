package Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Pages.CheckoutProcess;
import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.UserInfoPage;

public class saucedemo {

static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.saucedemo.com");
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPurchaseFlow() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("visual_user", "secret_sauce");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCart();
        productsPage.addToCart(); // You can add more products if needed
        productsPage.goToShoppingCart();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        UserInfoPage userInfoPage = new UserInfoPage(driver);
        userInfoPage.enterUserInfo("Maria", "Gomez", "10110");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        CheckoutProcess checkoutProcess = new CheckoutProcess(driver);
        checkoutProcess.completeCheckout();
    }
}
