package Pages;

import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    
    public class ProductsPage {
        private WebDriver driver;
    
        private By addToCartButton = By.cssSelector("*[data-test^=\"add-to-cart\"]");
        private By shoppingCartLink = By.cssSelector(".shopping_cart_badge");
    
        public ProductsPage(WebDriver driver) {
            this.driver = driver;
        }
    
        public void addToCart() {
            driver.findElement(addToCartButton).click();
        }
    
        public void goToShoppingCart() {
            driver.findElement(shoppingCartLink).click();
        }
    }
