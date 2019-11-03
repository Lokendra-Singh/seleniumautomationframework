import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import com.sun.tools.javac.util.Iterators;

public class ActionsClass {

	/*public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "https://staging.eprogresstracker.com/";
		driver.get(URL);
		int all_links = driver.findElements(By.tagName("a")).size(); // To get all the links on a page.
		System.out.println(all_links);

		WebElement scope = driver.findElement(By.className("foot-nav"));
		int footer_count = scope.findElements(By.tagName("a")).size();
		System.out.println(footer_count); // to get the link in a specific area/section.

		for (int i = 0; i < footer_count; i++) {
			String menu_link = Keys.chord(Keys.CONTROL, Keys.ENTER);
			// scope.findElements(By.tagName("a")).get(i).click(); //to click on each menu
			// in the same tab;
			scope.findElements(By.tagName("a")).get(i).sendKeys(menu_link);
		}

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		while (it.hasNext()) {
			Thread.sleep(2000);
			driver.switchTo().window(it.next());

			driver.getTitle();

			System.out.println(driver.getTitle());
			driver.getCurrentUrl();

		}

		WebElement footer = driver.findElement(By.className("navFooterVerticalRow navAccessibility"));

		WebElement MiniFooter = driver.findElement(By.className("navFooterLinkCol navAccessibility"));

	}*/
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.amazon.com/";
		driver.get(URL);
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
		
		
		
	}
	
}
