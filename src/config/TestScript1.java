package config;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestScript1 extends AppUtil1{
	@Test(priority = 2,enabled =false)
	public void adddition()
	{
		driver.findElement(By.name("display")).sendKeys("987654");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("9842");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Executing Addition test",true);
	}
	@Test(priority = 0,invocationCount = 3)
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys("67766");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("76");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Executing division test",true);
	}
	@Test(priority = 1)
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("765765");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("343");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Executing multiplication test",true);
	}
}
