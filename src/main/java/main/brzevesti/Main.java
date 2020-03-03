
package main.brzevesti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Main {

   
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
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
        
        WebElement authenticationLinks = driver.findElement(By.className("dropdown-toggle"));
        authenticationLinks.click();
        
        
        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
        logoutLink.click();
        
        System.out.println(driver.getTitle());
        
        
    }
    
}
