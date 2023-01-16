package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	
	@Given("Abrir Chrome")
	public void abrir_Chrome(){
		System.out.println("En este paso abre el navegador google chrome");
	}

	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2){
		System.out.println("En este paso ingresa las credenciales del usuario");

	}

	@Then("inicia sesion")
	public void inicia_sesion(){
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo Mytest.feature");
		
	}
	
}