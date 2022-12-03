package config;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends AppUtil {
@Test(priority = 1)
public void Branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing Branches Test",true);
}
@Test(priority =0)
public void Roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing Roles Test",true);
}
@Test(priority = 2)
public void Users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing Users Test",true);
}
}
