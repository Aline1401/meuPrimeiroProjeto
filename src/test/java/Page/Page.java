package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page extends BasePage{
	
	public Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Segmentos clickSolucoes() {
		driver.findElement(By.linkText("Soluções")).click();
		
		return new Segmentos(driver);
		
	}

	public List getSegmentosAtendidos() {
		List segmentosAtendidos = driver.findElements(By.xpath("//*[@id=\"seg-3\"]/a"));
		
		return segmentosAtendidos;
		
		/*new Page(driver).clickSolucoes().menuSegmentos();
		new LojaPage(driver).clickLojaAgropecuaria();
		return null;*/
	}

}
