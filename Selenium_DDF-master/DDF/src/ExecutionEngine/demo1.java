package ExecutionEngine;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.getData;


public class demo1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String data[][] = getData.getDataFromExcel("testdata.xlsx", "MySheet");
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		for (int i = 1; i < data.length; i++) {
			System.setProperty("webdriver.chrome.driver","F:\\work\\SeleniumDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			String username = data[i][0];
			String password = data[i][1];
			
			driver.get("http://facebook.com");
			driver.findElement(By.xpath(".//*[@id='email']"))
					.sendKeys(username);
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.id("loginbutton")).click();
			try {
				Thread.sleep(1000);
				/*String message = driver.findElement(
								By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/div[2]"))
						.getText();
				System.out.println(message);*/
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//driver.close();
			
		}
		// driver.get("file:///C:/Users/SID/Desktop/Selenium-practise.html") ;

	}
}
