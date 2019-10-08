import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocator1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver.", "C:\\\\Users\\\\Lokendra Singh\\\\git\\\\Addtional Library\\\\geckodriver.exe");
	WebDriver Driver = new FirefoxDriver();
	String URL=("office2.mywakaya.com");
	Driver.get(URL);
	Driver.findElement(By.xpath("//input[@id='loginform-identity']")).sendKeys("Test");
	}

}
