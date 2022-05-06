package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioOnlineShopping {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//disable notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.ajio.com/");
		
		//in the search box type bags and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
		//left of the screen under gender click men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		
		//under category click fashion bags
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		//print the count of items found
		String totalNumberOfItems = driver.findElement(By.className("length")).getText();
		System.out.println("The count is "+ totalNumberOfItems);
		
		//get the list of brand of the products displayed in the page and print the list
		List<WebElement> bagBrandList = (List<WebElement>) driver.findElement(By.className("brand"));
		System.out.println("Size is "+ bagBrandList.size());
		System.out.println("Brand names are ");
		for(WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		//get the list of bag names and print it
		List<WebElement> bagNameList = (List<WebElement>) driver.findElement(By.className("nameCls"));
		System.out.println("Size is "+ bagNameList.size());
		System.out.println("Names of the bags ");
		for(WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);	
		}
		
		driver.close();

	}	

}
