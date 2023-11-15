package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutProcess {
    private WebDriver driver;

    private By finishButton = By.cssSelector("*[data-test=\"finish\"]");

    public CheckoutProcess(WebDriver driver) {
        this.driver = driver;
    }

    public void completeCheckout() {
        driver.findElement(finishButton).click();
    }
}
