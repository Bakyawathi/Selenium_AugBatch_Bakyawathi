package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement usernameFiled = driver.findElement(By.id("username"));
		usernameFiled.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bakyawathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajagopal");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.className("smallSubmit")).click();
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
		String title = driver.getTitle();
		System.out.println("Title of the webpage is "+title);
		driver.close();	

	}

}
