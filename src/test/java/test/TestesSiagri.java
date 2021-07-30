package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.ArmazensGeraisPage;
import Page.LojaPage;
import Page.Page;
import Page.ProdutoAgricolaPage;
import Page.SementeiraPage;
import suporte.Web;

public class TestesSiagri {

	private WebDriver driver;
	private Page paginaPrincipal = new Page(driver);

	@Before
	public void Conectar() {
		driver = Web.createChrome();
	}

	@After
	public void Fechar() {
		driver.quit();
	}

	@Test
	public void Exercicio1() {
		paginaPrincipal.getSegmentosAtendidos();
		
		/*
		 
List segmentosEsperados = ["Distribuidor de Insumos", "Loja agropecuária", "Armazéns gerais", "Produto agrícola", "Sementeira", "Outros"];
List segmentosAtendidos = Page.getSegmentosAtendidos();

for (segmentoEsperado : segmentosEsperados) {
const SEGMENTO_DEVE_EXISTIR = true;

assertEquals(SEGMENTO_DEVE_EXISTIR, segmentosAtendidos.contains(segmentoEsperado), "O segmento " + segmentoEsperado + " não está na lista de segmentos esperados");
}*/
		 
		
		/*new Page(driver).clickSolucoes().menuSegmentos();
		
		String distribuidor = ((WebElement) driver.findElement(By.xpath("//*[@id=\"seg-3\"]/a[1]/span"))).getText();
		assertEquals("Distribuidor de insumos", distribuidor);

		String loja = ((WebElement) driver.findElement(By.xpath("//*[@id=\"seg-3\"]/a[2]/span"))).getText();
		assertEquals("Loja agropecuária", loja);

		String armazem = ((WebElement) driver.findElement(By.xpath("//*[@id=\"seg-3\"]/a[3]/span"))).getText();
		assertEquals("Armazéns gerais", armazem);

		String produtor = ((WebElement) driver.findElement(By.xpath("//*[@id=\"seg-3\"]/a[4]/span"))).getText();
		assertEquals("Produtor agrícola", produtor);

		String Sementeira = ((WebElement) driver.findElement(By.xpath("//*[@id=\"seg-3\"]/a[5]/span"))).getText();
		assertEquals("Sementeira", Sementeira);

		String Outros = ((WebElement) driver.findElement(By.xpath("//*[@id=\"seg-3\"]/a[6]/span"))).getText();
		assertEquals("Outros", Outros);*/
	}

	@Test
	public void Exercicio2() {

		new Page(driver).clickSolucoes().menuSegmentos();
		// no caso de teste está escrito "Softwares para gestão de distribuidores e
		// revendas de insumos agrícolas"
		// A validação está escrita conforme a informação da tela (Talvez tenha tido
		// atualização
		String Titulo = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/h2")))
				.getText();
		assertEquals("Softwares para gestão de distribuidores de insumos agrícolas", Titulo);
		String descricao = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/p")))
				.getText();
		assertEquals(
				"Otimize processos, reduza desperdícios e tenha o controle de suas lojas em qualquer hora e lugar. Com o Grupo Siagri, você compra melhor, evita perdas no estoque, vende com mais eficiência e ainda tem mais segurança nas operações de Barter!",
				descricao);

		driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/span")).click();
		// verificando abertura do formulário conforme a descrição, será?

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-form\"]/div/h4")));

		// Validar desafios
		WebElement estoque = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[1]"));
		assertTrue(estoque.getText().equals("Estoque eficiente"));

		WebElement preco = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[3]/span"));
		assertTrue(preco.getText().equals("Formação de preços"));

		WebElement gestao = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[6]/span"));
		assertTrue(gestao.getText().equals("Gestão de logística (expedição)"));

		WebElement mix = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[8]/span"));
		assertTrue(mix.getText().equals("Ampliar mix de atividades (armazenagem, Barter etc)"));

		WebElement orcamento = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[10]/span"));
		assertTrue(orcamento.getText().equals("Gestão orçamentária"));

	}

	@Test
	public void Exercicio3() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new LojaPage(driver).clickLojaAgropecuaria();
		String Titulo = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/h2")))
				.getText();
		assertEquals("Softwares para gestão de lojas e varejo agropecuário", Titulo);
		String descricao = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/p[2]")))
				.getText();
		assertEquals(
				"Ganhe agilidade em vendas, confiança nos controles de estoque e custos. Fidelize seu cliente e gerencie sua loja agropecuária de forma completa com o software Siagri.",
				descricao);

		driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/span")).click();
// verificando abertura do formulário conforme a descrição
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-form\"]/div/h4")));

// Validar desafios
		WebElement agilidade = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[1]/span"));
		assertTrue(agilidade.getText().equals("Agilidade no atendimento"));

		WebElement eficiencia = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[2]/span"));
		assertTrue(eficiencia.getText().equals("Eficiência operacional"));

		WebElement controle = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[3]/span"));
		assertTrue(controle.getText().equals("Controle de comissionamento"));

		WebElement fiscal = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[5]/span"));
		assertTrue(fiscal.getText().equals("Conformidade fiscal"));

		WebElement fluxo = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[6]/span"));
		assertTrue(fluxo.getText().equals("Eficiência no fluxo de caixa em dia"));

	}

	@Test
	public void Exercicio4() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new ArmazensGeraisPage(driver).clickArmazensGerais();
		String Titulo = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/h2")))
				.getText();
		assertEquals("Softwares para gestão de armazéns gerais e cerealistas", Titulo);
		String descricao = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/p")))
				.getText();
		assertEquals(
				"Ganhe eficiência desde o recebimento até a expedição dos grãos. Com o Grupo Siagri, você gerencia todos os processos de armazenagem de grãos com agilidade e segurança.",
				descricao);

		driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/span")).click();

		// verificando abertura do formulário conforme a descrição, será?
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-form\"]/div/h4")));
		driver.findElement(By.xpath("//*[@id=\"form-close\"]")).click();

		// Validar desafios
		WebElement contrato = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[1]/span"));
		assertTrue(contrato.getText().equals("Gestão de contratos"));

		WebElement terceiros = driver.findElement(By.xpath("/html/body/section[4]/div/div[2]/div[2]/span"));
		assertTrue(terceiros.getText().equals("Controle de saldos de terceiros"));

		WebElement retencoes = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[4]/span"));
		assertTrue(retencoes.getText().equals("Controle de retenções e transgenia"));

		WebElement exposicao = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[5]/span"));
		assertTrue(exposicao.getText().equals("Análise de exposição"));

		WebElement servico = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[6]/span"));
		assertTrue(servico.getText().equals("Controle de serviços prestados"));
	}

	@Test
	public void Exercicio5() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new ProdutoAgricolaPage(driver).clickProdutorAgricola();
		String Titulo = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/h2")))
				.getText();
		assertEquals("Softwares de gestão para produtores de grãos e algodão", Titulo);
		String descricao = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/p")))
				.getText();
		assertEquals(
				"Gestão do planejamento da safra à contabilidade. Com o Grupo Siagri você gerencia seu negócio de ponta a ponta, centralizando a gestão administrativa, financeira, fiscal e operacional.",
				descricao);

		driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/span")).click();

		// verificando abertura do formulário conforme a descrição
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-form\"]/div/h4")));
		driver.findElement(By.xpath("//*[@id=\"form-close\"]")).click();

		WebElement safra = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[1]/span"));
		assertTrue(safra.getText().equals("Planejamento de safra"));

		WebElement armazenagem = driver
				.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[2]/span"));
		assertTrue(armazenagem.getText().equals("Gestão de estoque (armazenagem)"));

		WebElement custo = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[5]/span"));
		assertTrue(custo.getText().equals("Controle de custos"));

		WebElement processo = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[9]/span"));
		assertTrue(processo.getText().equals("Padronização de processos"));

		WebElement orcamento = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[8]/span"));
		assertTrue(orcamento.getText().equals("Gestão orçamentária"));
	}

	@Test
	public void Exercicio6() {
		new Page(driver).clickSolucoes().menuSegmentos();
		new SementeiraPage(driver).clickSementeira();
		String Titulo = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/h2")))
				.getText();
		assertEquals("Softwares para gestão de sementeiras", Titulo);
		String descricao = ((WebElement) driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/p")))
				.getText();
		assertEquals(
				"Ganhe eficiência no processo de beneficiamento de sementes. Com as soluções Siagri, você gerencia desde o recebimento do grão, até o embarque de sementes.",
				descricao);

		driver.findElement(By.xpath("//*[@id=\"segmentos-titulo\"]/div/div[1]/span")).click();

		// verificando abertura do formulário conforme a descrição
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-form\"]/div/h4")));
		driver.findElement(By.xpath("//*[@id=\"form-close\"]")).click();

		WebElement sementes = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[1]/span"));
		assertTrue(sementes.getText().equals("Gestão de recebimento, produção e expedição de sementes"));

		WebElement lotes = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[2]/span"));
		assertTrue(lotes.getText().equals("Controle de lotes"));

		WebElement vendas = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[3]/span"));
		assertTrue(vendas.getText().equals("Gestão de vendas das semente"));

		WebElement colheita = driver.findElement(By.xpath("//*[@id=\"segmentos-vantagens\"]/div/div[2]/div[6]/span"));
		assertTrue(colheita.getText().equals("Gestão da colheita e armazenagem de grãos"));
	}

}
