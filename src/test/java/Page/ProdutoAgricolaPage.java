package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoAgricolaPage extends BasePage{

	public ProdutoAgricolaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ProdutoAgricolaPage clickProdutorAgricola() {
	
	driver.findElement(By.linkText("Produtor agrícola")).click();
    return this;
}
}
