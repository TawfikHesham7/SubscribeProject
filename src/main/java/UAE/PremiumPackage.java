package UAE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PremiumPackage {


    ChromeDriver Navigataion ;
    @BeforeTest
    public void openURL() {
        Navigataion = new ChromeDriver();
        Navigataion.navigate().to("URL");

    }

    @Test
    public void findElementsOfBasicPackage() {

        WebElement Egypt = Navigataion.findElement(By.xpath("EgyptXpath"));
        Egypt.click();
        WebElement  PremiumId = Navigataion.findElement(By.id(PremiumID)) ;
        PremiumId.click();
        WebElement   next = Navigataion.findElement(By.id(Next)) ;


    }
    @AfterTest
    public void closeDriver () {
        Navigataion.quit();
    }






}
