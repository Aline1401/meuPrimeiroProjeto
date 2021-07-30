package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArmazensGeraisPage extends BasePage{

	public ArmazensGeraisPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ArmazensGeraisPage clickArmazensGerais() {
		driver.findElement(By.linkText("Armazéns gerais")).click();
		return this;
	}

	
}
