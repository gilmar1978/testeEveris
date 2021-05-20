package servicos;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilidades.Utilidades;

public class BeforeAndAfter extends Driver {
	 static ExtentReports extent;
	 static ExtentTest logger;
	@Before
	public static void inicializaBrowser() {
		System.out.println("In�cio do teste");
	}
		
//	@After
//	public static void finalizarTeste(Scenario teste){		
//		encerraDriver();
//		System.out.println("Teste finalizado");
//	}
}
