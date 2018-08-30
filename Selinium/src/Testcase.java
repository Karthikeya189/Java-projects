import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHIKEYA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Karthikeya");
		driver.findElement(By.name("lastname")).sendKeys("Raavi");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("datepicker")).sendKeys("09/21/1992");
		driver.findElement(By.id("profession-1")).sendKeys("Automation Tester");
		
		WebElement uploadElement = driver.findElement(By.id("photo"));
		uploadElement.sendKeys("C:\\Users\\KARTHIKEYA\\Pictures\\Saved Pictures\\car.jpg");
		driver.findElement(By.id("tool-0")).click();
		driver.findElement(By.id("continents")).sendKeys("continents");
		driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
		driver.findElement(By.xpath(".//*[contains(@id,'submit')]")).click();
		//driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
}
	