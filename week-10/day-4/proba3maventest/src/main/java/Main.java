import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {

    private static WebDriver driver = new FirefoxDriver();

    public static void main(String[] args) throws Exception{
        getGoogle();
        searchInGoogle();
        //closeBrowser();
    }

    public static void getGoogle() {
        driver.get("https://google.com");
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void searchInGoogle() throws Exception{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Süsü");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        WebElement logo = driver.findElement(By.id("logo"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(logo));

        //WebElement googleSearchButton = driver.findElement(By.name("btnK"));
        //new WebDriverWait(driver, 10)
        //        .until(ExpectedConditions.visibilityOf(googleSearchButton));
        //googleSearchButton.click();
    }

    public static String getTitle(){
        return driver.getTitle();
    }
}