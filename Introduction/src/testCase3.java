
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "/home/ilan/Desktop/Aarthi_2018 Jobs/Courses_2018/Udemy_Selenium course_2018/MicrosoftWebDriver");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
