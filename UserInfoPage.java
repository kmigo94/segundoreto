package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserInfoPage {
    private WebDriver driver;
    private WebElement firstNameElement;
    private WebElement lastNameField;
    private WebElement postalCodeField;
    private WebElement continueButton;

    public UserInfoPage(WebDriver driver) {
        this.driver = driver;
        initializeElements();
    }

    private void initializeElements() {
        firstNameElement = driver.findElement(By.cssSelector("[data-test='firstName']"));
        lastNameField = driver.findElement(By.cssSelector("[data-test='lastName']"));
        postalCodeField = driver.findElement(By.cssSelector("[data-test='postalCode']"));
        continueButton = driver.findElement(By.cssSelector("[data-test='continue']"));
    }

    public void enterUserInfo(String firstName, String lastName, String postalCode) {
        firstNameElement.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        continueButton.click();
    }
}
