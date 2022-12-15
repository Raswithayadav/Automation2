package website.Stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.CartPage;
import pageobjects.CheckOut;
import pageobjects.ConfirmationPage;
import pageobjects.Loginpage;
import pageobjects.Productcatelogue;

public class StepDefinitions {
	WebDriver driver;

	@Given("login with username and password")
	public void login() throws IOException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Loginpage loginpage = new Loginpage(driver);
		loginpage.goTo();
		loginpage.LoginApplication();
	}

	@And("Adding products to cart page")
	public void adding() throws IOException {
		Productcatelogue products = new Productcatelogue(driver);
		products.catelogue();
	}

	@When("checking out the cart products")
	public void Checkout_the_products_and_submit_the_order() throws InterruptedException, IOException {
		CartPage Cart = new CartPage(driver);
		Cart.cartproducts();
	}

	@And("Filling shipping details and placing order")
	public void placingorder() throws IOException, InterruptedException {
		CheckOut check = new CheckOut(driver);
		check.shippingDetails();
	}

	@Then("Getting conformation message")
	public void message_displayed_on_Confirmationpage() throws InterruptedException {
		ConfirmationPage conform = new ConfirmationPage(driver);
		conform.verifyConfirmationMessage();
	}
}
