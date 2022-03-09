package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateByID {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver","C:\\selenium LTI\\SELENIUM LTI\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> links=driver.findElements(By.tagName("a"));
	    for(WebElement w:links) {
	    	System.out.println(w.getText());
	    }
        //driver.findElement(By.tagName("a")).click();
        //driver.findElement(By.className("signinbtn")).click();
       // driver.findElement(By.linkText("Forgot Password")).click();
	
        //driver.findElement(By.name("login")).sendKeys("sivaram");
       // driver.findElement(By.id("password")).sendKeys("sivaram");
        //driver.findElement(By.linkText("Forgot Password")).click();
	}
}
	


