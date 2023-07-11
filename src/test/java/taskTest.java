import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class taskTest {
    public WebDriver driver;

    @Test
    public void browser() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        // Locating the Tutorial (Parent element)
        WebElement tutorial = driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Tutorials\"]"));
        Actions actions = new Actions(driver);//Instantiating Actions class
        actions.moveToElement(tutorial);//Hovering on Tutorial
        WebElement testing = driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Testing\""));// Locating the element from Sub Menu
        actions.moveToElement(testing);//To mouseover on sub menu
        WebElement Selenium = driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Testing\""));// Locating the element from Sub Menu
        actions.moveToElement(Selenium);//To mouseover on sub menu
        actions.click().build().perform();//build()- used to compile all the actions into a single step
        driver.findElement(By.xpath("//a[@href=\"https://www.hyrtutorials.com/search/label/Tutorials\"]")).click();
        driver.findElement(By.xpath("//label[text()=\"First Name \"]/following-sibling::input[1]")).sendKeys("First Name");
        Thread.sleep(2000);
        //driver.quit();
    }

}


