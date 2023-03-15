import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Giris {

    public static void main (String[]args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Dilara Tekin");


        WebElement eMail = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));

        eMail.click();
        eMail.sendKeys("dilara-tekin2000@hotmail.com");


        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAddress.click();
        currentAddress.sendKeys("İstanbul,Türkiye");

        JavascriptExecutor jsx = (JavascriptExecutor) driver; // selenium sayfa asagi kaydirma
        jsx.executeScript("window.scrollBy(0,450)");


        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddress.click();
        permanentAddress.sendKeys("İstanbul,Türkiye");

      WebElement submitButtoon = driver.findElement(By.id("submit"));
      submitButtoon.click();

      driver.quit();


    }
}
