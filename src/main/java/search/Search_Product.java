package search;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		WebElement searchtf= driver.findElement(By.xpath("//input[@id=':r1:']"));
		searchtf.sendKeys("sofa");
		searchtf.sendKeys(Keys.ENTER);
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		Thread.sleep(3000);
		WebElement secondsofa= driver.findElement(By.xpath("(//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineHover mui-8ujno3'])[2]"));
		secondsofa.click();
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		
		WebElement addtocartbt= driver.findElement(By.xpath("//input[@id='add-to-cart-btn']"));
		
		addtocartbt.click();
		
		

	}

}
