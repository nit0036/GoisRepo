package GOIS;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public void TestMavenJenkinsGit() {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");	
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://google.com");
    }
}
