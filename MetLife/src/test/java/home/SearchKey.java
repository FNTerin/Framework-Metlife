package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by zayan on 5/7/14.
 */
public class SearchKey extends Base {

    @Test
    public void testSearchBoxTest() {
        //driver.findElement(By.cssSelector("put css/xpath/id")).click();
        driver.findElement(By.cssSelector("#form-refineSearchQuery")).sendKeys("Investment", Keys.ENTER);
    }


    @Test
    public void testSearchBoxTest1() {
        driver.findElement(By.cssSelector("#hdMenuDiv>ul>li>a")).click();
        driver.findElement(By.cssSelector("#form-refineSearchQuery")).sendKeys("Planning", Keys.ENTER);
        driver.switchTo().defaultContent();

    }

}

