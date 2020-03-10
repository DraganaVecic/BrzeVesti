
package main.brzevesti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import helper.Helper;



public class Main {

   
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        
        driver.manage().window().fullscreen();
        
        driver.get("http://bvtest.school.cubes.rs/login");
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
        
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        
        System.out.println(driver.getTitle());
        
        //signaturesLink
        
        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();
        
        System.out.println(driver.getTitle());

        WebElement categoriesLink = driver.findElement(By.partialLinkText("egori"));
        categoriesLink.click();
        
        System.out.println(driver.getTitle());
        
        WebElement addCategoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addCategoryButton.click();
        
        WebElement categoryTitleField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        categoryTitleField.sendKeys(Helper.getRandomText());
        
        WebElement saveCategoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("save-category-button")));
        saveCategoryButton.click();
                
                
                
        WebElement regionsLink = driver.findElement(By.linkText("Regions"));
        regionsLink.click();
        
        System.out.println(driver.getTitle());
        
        WebElement portalsLink = driver.findElement(By.linkText("Portals"));
        portalsLink.click();
        
        System.out.println(driver.getTitle());
        
        WebElement sourcesLink = driver.findElement(By.linkText("Sources"));
        sourcesLink.click();
        
        System.out.println(driver.getTitle());


        //signaturesLink click
        //console ->title
        
       // WebElement authenticationLinks = driver.findElement(By.className("dropdown-toggle"));
      //  authenticationLinks.click();
        
        
       // WebElement logoutLink = driver.findElement(By.linkText("Logout"));
      //  logoutLink.click();
        
       // System.out.println(driver.getTitle());
        
      //  driver.quit();
        
    }
    
}
