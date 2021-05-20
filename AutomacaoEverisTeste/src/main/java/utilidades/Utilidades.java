package utilidades;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import servicos.Driver;


public class Utilidades extends Driver {


	
	public static void clicar(By elemento) {
		acharElemento(elemento).click();
	}

	
	public static WebElement acharElemento(By elemento) {
		return driver.findElement(elemento);
	}
	
	
	public void esperaAteElementoEstarClicavel(By elemento) {		
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	public void esperarAtePresencaDoElementoDesejado(By elemento) {
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		
	}
	
	
	public static void limpaEInsereTexto(String texto, By campo) {
		if(acharElemento(campo).isDisplayed()) {
			acharElemento(campo).clear();
			acharElemento(campo).sendKeys(texto);
			
		}
	}



}
	
