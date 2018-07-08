package br.com.pageObject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.AbrirNavegadorTest;

public class buscaNavegador {

	@Test
	public void verificaBusca() {

		WebDriver driver = new ChromeDriver();

		AbrirNavegadorTest navegador = new AbrirNavegadorTest();
		try {
			navegador.setUpBeforeClass();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
