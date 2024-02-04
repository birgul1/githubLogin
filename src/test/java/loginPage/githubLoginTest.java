package loginPage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBaseBeforeAfter;

public class githubLoginTest extends TestBaseBeforeAfter {

    @Test
    public void mailSifre(){
        System.setProperty("webdriver.chorme.driver", "src/main/resources/chormedriver.exe");

        WebDriver chormeDriver = new ChromeDriver();
        chormeDriver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fsignup%3Fref_cta%3DSign%2Bup%26ref_loc%3Dheader%2Blogged%2Bout%26ref_page%3D%252F%26source%3Dheader-home");

        WebElement mail = chormeDriver.findElement(By.id("login_field"));
        WebElement password = chormeDriver.findElement(By.id("password"));
        WebElement signIn = chormeDriver.findElement(By.name("commit"));

        mail.sendKeys("denemetest@gmail.com");
        password.sendKeys("testdeneme123");

        signIn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chormeDriver.quit();
    }
}
