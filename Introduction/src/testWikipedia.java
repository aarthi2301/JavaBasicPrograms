
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testWikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/ilan/Desktop/Aarthi_2018 Jobs/Courses_2018/Udemy_Selenium course_2018/chromedriver");
		WebDriver driver = new ChromeDriver(); // For FireFox - no need to set property
		driver.get("https://www.wikipedia.org/");
		
		WebElement link;
		link = driver.findElement(By.id("js-link-box-en"));
		link.click();
		Thread.sleep(5000);
		
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
