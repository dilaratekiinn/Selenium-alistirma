import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main (String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //// Timeouts////

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // sayfanın yüklenmesini bekler.
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // yapılan işlemleri bekler.


        // Window
        driver.manage().window().maximize(); // pencereyi maximize eder.
        int X = driver.manage().window(). getPosition().getX(); // pencereinin X düzlemindeki konumunu verir.
        int Y = driver.manage().window(). getPosition().getY(); // pencereinin Y  düzlemindeki konumunu verir.



        // URL
        driver.get("https://www.google.com"); // siteye gitmek amacıyla kullanılır.
        String CurrentUrl = driver.getCurrentUrl(); // sayfadaki urli getirir.
        String Title=  driver.getTitle(); // Sayfanın titlenıni getirir.
        String PageSource= driver.getPageSource(); // Sayfanın kaynak kodlarını getirir.

        // Navigate
        driver.navigate().back(); // geri gitmek için
        driver.navigate().forward(); // ileri gitmek için
        driver.navigate().refresh();// sayfayı yenilemek için

        WebElement element1 = driver.findElement(By.id(""));
        WebElement element2 = driver.findElement(By.cssSelector(""));
        WebElement element3 = driver.findElement(By.xpath(""));
        WebElement element4 = driver.findElement(By.name(""));
        WebElement element5 = driver.findElement(By.linkText(""));
        WebElement element6 = driver.findElement(By.className(""));


        element1.click();// tıklama işlemi
        element1.sendKeys(""); // elemana text gönderme
    }
}
