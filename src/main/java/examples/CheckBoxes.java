
package examples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckBoxes {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().fullscreen();
        driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");

        System.out.println("Page title: " + driver.getTitle());

        //The first way for selecting items by using name locator 
        WebElement yesOptionCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("permission")));
        yesOptionCheckbox.click();

        WebElement contactDetailsCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("discardinfo")));
        contactDetailsCheckbox.click();

        // The second way for  selecting items by using list of elements
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("articleBody")));
        List<WebElement> checkboxes = table.findElements(By.xpath("//input[@type='checkbox']"));

      
        System.out.println("Size of the checkbox group: " + checkboxes.size());

        for (int i = 0; i < checkboxes.size(); i++) {
            WebElement currentElement = checkboxes.get(i);

//            currentElement.click();
            
            System.out.println("Element: " + i);

            if (currentElement.isSelected()) {
                System.out.println("Element is selected");
            } else {
                System.out.println("Element is not selected");
            }

            if (currentElement.isDisplayed()) {
                System.out.println("Element is displayed");
            } else {
                System.out.println("Element is not displayed");
            }

            if (currentElement.isEnabled()) {
                System.out.println("Element is enabled");
            } else {
                System.out.println("Element is disabled");
            }

        }

        // Click on every element in list
//        for (WebElement currentElement : checkboxes) {
//            currentElement.click();
//        }

        // The third way for selecting items
        for (WebElement checkbox : checkboxes) {
            if (checkbox.getAttribute("value").equals("Y") || checkbox.getAttribute("value").equals("YES")) {
                checkbox.click();
            }
        }

        // Click only on uselected item
//        for (WebElement checkbox : checkboxes) {
//            if (!checkbox.isSelected()) {
//                checkbox.click();
//            }
//        }

        Thread.sleep(8000);
        driver.quit();
    }

}
