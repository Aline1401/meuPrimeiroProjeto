package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Segmentos extends BasePage{
	public Segmentos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Segmentos menuSegmentos() {
		driver.findElement(By.linkText("Segmentos")).click();
		return this;
	}
	
}
