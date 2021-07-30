package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SementeiraPage extends BasePage{

	public SementeiraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SementeiraPage clickSementeira() {
	
		driver.findElement(By.linkText("Sementeira")).click();
    return this;
}
}
