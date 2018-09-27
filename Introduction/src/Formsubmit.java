
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "/home/ilan/Desktop/Aarthi_2018 Jobs/Udemy_Selenium course_2018/chromedriver");

WebDriver driver=new ChromeDriver();

driver.get("http://spicejet.com/");

Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']")));

dropdown.selectByIndex(3);

//dropdown.selectByVisibleText("3 Adults");

//dropdown.selectByValue("8");

/*System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
*/
}

}