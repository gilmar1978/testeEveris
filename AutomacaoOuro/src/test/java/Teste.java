import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");
	}

}
