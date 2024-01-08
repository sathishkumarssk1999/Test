package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstone
{

public static void main (String args[])
{
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");

       String title = driver.getTitle();
       System.out.println(title);

       String url = driver.getCurrentUrl();
       System.out.println(url);

       WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
       name.sendKeys("abc.xyz@gmail.com");
       System.out.println(name.getAttribute("id"));
       driver.quit();
}

}
