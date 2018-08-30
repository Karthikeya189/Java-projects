import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercurytours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHIKEYA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.xpath(".//*[contains(@href,'mercuryregister.php')]")).click();
		//driver.findElement(By.name("firstName")).sendKeys("Karthikeya");
		driver.findElement(By.xpath(".//*[contains(@name,'firstName')]")).sendKeys("Karthikeya");
		//driver.findElement(By.name("lastName")).sendKeys("Raavi");
		driver.findElement(By.xpath(".//*[contains(@name,'lastName')]")).sendKeys("Raavi");
		driver.findElement(By.xpath(".//*[contains(@name,'phone')]")).sendKeys("8046256793");
		//driver.findElement(By.name("phone")).sendKeys("8046256793");
		driver.findElement(By.xpath(".//*[contains(@name,'userName')]")).sendKeys("Karthikeya.raavi@gmail.com");
		//driver.findElement(By.name("userName")).sendKeys("Karthikeya.raavi@gmail.com");
		//driver.findElement(By.name("address1")).sendKeys(" 1008 N, 6th street" );
		driver.findElement(By.xpath(".//*[contains(@name,'address')]")).sendKeys("1008N 6th street");
		driver.findElement(By.xpath(".//*[contains(@name,'city')]")).sendKeys("Nashville");
		//driver.findElement(By.name("city")).sendKeys("Nashville");
		//driver.findElement(By.name("state")).sendKeys("Tennessee");
		driver.findElement(By.xpath(".//*[contains(@name,'state')]")).sendKeys("Tennessee");
		driver.findElement(By.name("postalCode")).sendKeys("37207");
		//driver.findElement(By.xpath(".*//[contains(@name,'postalCode')]")).sendKeys("37207");
		driver.findElement(By.xpath(".//*[contains(@name,'country')]")).sendKeys("UNITED STATES");
		//driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		driver.findElement(By.name("email")).sendKeys("Karthikeya.raavi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("8046256793");
		driver.findElement(By.name("confirmPassword")).sendKeys("8046256793");
	    //driver.findElement(By.xpath(".//*[contains(@id,'submit')]")).click();
		driver.findElement(By.xpath(".//*[contains(@name,'register')]")).click();
		
		
		
		
	}
}
