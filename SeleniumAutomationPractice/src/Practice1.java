import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

	/*
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.google.com/";
		driver.get(URL);
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Test"); custom CSS selector
		driver.findElement(By.cssSelector("div[class='RNNXgb']////")).sendKeys("Testing test");// Super parent to child traversing
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Test");
		//driver.getPageSource(); // only this function designed to those web application for which right click and console are disabled.
		
	}*/
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		driver.get(URL);
		/*//driver.findElement(By.xpath("//input[@value='RoundTrip']")).click(); to click on a single radio button
		System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());
		int rad= driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		for (int i=1; i<rad; i++) {
			String rad_name=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");	
			System.out.println(rad_name);
			if(rad_name.equals("RoundTrip")) {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
				
			}
		}*/
		
		int chck= driver.findElements(By.xpath("//div[@id='discount-checkbox'] //input[@type='checkbox']")).size();
		System.out.println(chck);
		for(int j=0; j<=chck; j++) {
			String chck_name=driver.findElements(By.xpath("//div[@id='discount-checkbox'] //input[@type='checkbox']")).get(j).getAttribute("name");
			System.out.println(chck_name);
			//driver.findElements(By.xpath("//div[@id='discount-checkbox'] //input[@type='checkbox']")).get(j).click();
			
			Thread.sleep(3000);
			if(chck_name.equals("ctl00$mainContent$chk_Unmr")) {
				driver.findElements(By.xpath("//div[@id='discount-checkbox'] //input[@type='checkbox']")).get(j-2).click();
				Thread.sleep(3000);
			}
			}		
		
	}
}
