package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchtf= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchtf.sendKeys("swizerland");
		searchtf.sendKeys(Keys.ENTER);
		
		

	}

}
