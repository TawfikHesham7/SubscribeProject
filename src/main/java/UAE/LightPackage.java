package UAE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LightPackage {
    ChromeDriver Navigataion ;
    @BeforeTest
    public void openURL() {
        Navigataion = new ChromeDriver();
        Navigataion.navigate().to("URL");

    }

    @Test
    public void findElementsofLightPackage() {

        WebElement Egypt = Navigataion.findElement(By.xpath("EgyptXpath"));
        Egypt.click();
        WebElement  BasicId = Navigataion.findElement(By.id("LightId")) ;
        BasicId.click();
        WebElement   next = Navigataion.findElement(By.id("Next")) ;
        next.click();
    }
    @AfterTest
    public void closeDriver () {
        Navigataion.quit();
    }









}
