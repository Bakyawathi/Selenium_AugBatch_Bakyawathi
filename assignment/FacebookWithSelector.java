package week2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookWithSelector {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
				firstName.sendKeys("AAAA");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BBBB");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("aaabbb@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select dayDD=new Select(day);
		dayDD.selectByValue("15");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select monthDD=new Select(month);
		monthDD.selectByVisibleText("Oct");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select yearDD=new Select(year);
		yearDD.selectByVisibleText("1993");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
