package org.test.second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPaper {
public static void main(String[] args) {
	System.setProperty ("webdriver.chrome.driver",
	"C:\\Users\\91638\\eclipse-workspace\\SecondDayTest\\Library\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get( " https://www.swiggy.com/");
String url =driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);



String title2 = driver.getTitle();
System.out.println(title2);
driver.close();
driver.quit();

WebElement findElement = driver.findElement(By.id("email"));
System.out.println(findElement);
WebElement findElement2 = driver.findElement(By.id("pass"));
System.out.println(findElement2);


}
}
