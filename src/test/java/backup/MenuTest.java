package backup;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Page.ArmazensGeraisPage;
import Page.LojaPage;
import Page.Page;
import Page.ProdutoAgricolaPage;
import Page.SementeiraPage;
import suporte.Web;


public class MenuTest {
	private static WebDriver driver;

	@Before
	public void Conectar() {
		driver = Web.createChrome();

	}

	@Test
	public void clickSegmentos() {
		new Page(driver).clickSolucoes().menuSegmentos();
		
	}
	@Test
	public void clickLojaAgropecuaria() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new LojaPage(driver).clickLojaAgropecuaria();
	}
	@Test
	public void clickArmazem() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new ArmazensGeraisPage(driver).clickArmazensGerais();
	}
	@Test
	public void clickProdutoAgricola() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new ProdutoAgricolaPage(driver).clickProdutorAgricola();
	
	}
	public void clickSementeira() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new SementeiraPage(driver).clickSementeira();
	}
	
}
