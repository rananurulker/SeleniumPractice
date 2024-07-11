package day01_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.WebAppManifest;

import java.time.Duration;

public class P05 {
    public static void main(String[] args) throws InterruptedException {
        /*
        https://babayigit.net/test/ adresine gidip, adres cubuguna
        1- Vizontele aratip sonuc sayisini yazdirin.
        2- 12 Angry man aratip sonuc sayisini yazdirin.
        3- Saving Private Ryan aratip sonuc sayisini yazdirin.
        4- 3 Idiots aratip sonuc sayisini yazdirin.
         */
        System.setProperty("webdriver.chrome.driver","files/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://babayigit.net/test/");
        driver.findElement(By.id("search")).sendKeys("Vizontele");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hdtb-tls")).click();
        Thread.sleep(1000);
        WebElement sonuc=driver.findElement(By.id("result-stats"));
        String sonucText=sonuc.getText();
        System.out.println(sonucText);
        driver.quit();




    }
}
