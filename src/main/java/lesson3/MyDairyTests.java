package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDairyTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru/");
        Cookie cookie = new Cookie("_identity_","6cee30b69f56a7920efca5da57d19c91e00b0082eb4f37da6860df807f8d479fa%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3566934%2C%22CgshUojyzykoecUCp2ANOT13pVew5Cqx%22%2C2592000%5D%22%3B%7D");

        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        Thread.sleep(5000);

        driver.get("https://tostertester.diary.ru/");

        WebElement deleteNote = driver.findElement(By.xpath(("//span[@class='postActionLinks']/a[@class='delPostLink']")));
        deleteNote.click();
        WebElement confirmDelete = driver.findElement(By.xpath("//div[@class='text-right']/button[@class='btn btn-primary on confirm_delete_post']"));
        confirmDelete.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
