
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/ilan/Desktop/Aarthi_2018 Jobs/Courses_2018/Udemy_Selenium course_2018/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
