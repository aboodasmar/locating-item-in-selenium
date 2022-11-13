import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\my chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		
		driver.findElement(By.id("email-input")).sendKeys("abdalfatahalasmar@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("A!2018r");
		driver.findElement(By.id("date-input")).sendKeys("27-12-20");
		driver.findElement(By.id("mobile-input")).sendKeys("0788591660");
		
		driver.findElement(By.tagName("button")).click();

	}

}
