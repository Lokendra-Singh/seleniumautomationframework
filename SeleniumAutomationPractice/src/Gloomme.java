import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Gloomme {
	
	// To validate that an element is enable or disable

	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.spicejet.com/";
		driver.get(URL);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Div1")).getAttribute("style");
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("checkbox is enable");
		}
		else {
			System.out.println("Checkbox is disable");
		}
			

	}*/
	
	//static dropdown handling
	
	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.spicejet.com/";
		driver.get(URL);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select sc= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//sc.selectByValue("AED");  //validating through value.
		//sc.selectByIndex(3);  //validating through zIndex.
		sc.selectByVisibleText("AED");   //validating through name or visibletext
		
	}*/
	
	//dynemic dropdown handling
	
	/*public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.spicejet.com/";
		driver.get(URL);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(3000);
}*/
	
	//Java script pop up handling
	
	/*public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.spicejet.com/";
		driver.get(URL);
		driver.switchTo().alert().accept();  //to click on Ok/yes button
		driver.switchTo().alert().dismiss(); // to click on Cancel/No button
		driver.manage().window().maximize();   // to maximize the current window
		driver.close();  //to close the tab
 		driver.quit(); //to close the tab
		
	}*/
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.makemytrip.com/";
		driver.get(URL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Jai");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
	}
}