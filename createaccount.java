package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createaccount {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver","C:\\selenium LTI\\SELENIUM LTI\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        //driver.findElement(By.cssSelector
        //		("div.table"<div.row:nth-of-type(1)>div.cell:nth-o-type(2))
       /* Object username;
		username.sendKeys("sivaram");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("sivaram");
        String UsernameValue=username.getText();
        username.clear();*/
       // driver.findElement(By.cssSelector("input[name*='me']")).sendKeys("sivaram");//
       // driver.findElement(By.cssSelector("input[value$='my account>>']")).click();
       // driver.findElement(By.cssSelector("input[name*='me']")).click();//

	}

}